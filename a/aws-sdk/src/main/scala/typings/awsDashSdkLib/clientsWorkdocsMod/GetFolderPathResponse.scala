package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFolderPathResponse extends js.Object {
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.undefined
}

object GetFolderPathResponse {
  @scala.inline
  def apply(Path: ResourcePath = null): GetFolderPathResponse = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[GetFolderPathResponse]
  }
}

