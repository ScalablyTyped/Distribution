package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectRequest extends js.Object {
  /**
    *  ZIP or YAML file which contains configuration settings to be used when creating the project. This may be the contents of the file downloaded from the URL provided in an export project operation. 
    */
  var contents: js.UndefOr[Contents] = js.undefined
  /**
    *  Name of the project. 
    */
  var name: js.UndefOr[ProjectName] = js.undefined
  /**
    *  Default region where project resources should be created. 
    */
  var region: js.UndefOr[ProjectRegion] = js.undefined
  /**
    *  Unique identifier for an exported snapshot of project configuration. This snapshot identifier is included in the share URL when a project is exported. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.undefined
}

object CreateProjectRequest {
  @scala.inline
  def apply(
    contents: Contents = null,
    name: ProjectName = null,
    region: ProjectRegion = null,
    snapshotId: SnapshotId = null
  ): CreateProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

