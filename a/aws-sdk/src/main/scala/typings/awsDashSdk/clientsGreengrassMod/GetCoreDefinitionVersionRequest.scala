package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCoreDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: __string = js.native
  /**
    * The ID of the core definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListCoreDefinitionVersions'' requests. If the version is the last one that was associated with a core definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var CoreDefinitionVersionId: __string = js.native
}

object GetCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: __string, CoreDefinitionVersionId: __string): GetCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any], CoreDefinitionVersionId = CoreDefinitionVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCoreDefinitionVersionRequest]
  }
}

