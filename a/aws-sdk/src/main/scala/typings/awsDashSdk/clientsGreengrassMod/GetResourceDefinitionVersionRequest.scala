package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: __string
  /**
    * The ID of the resource definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListResourceDefinitionVersions'' requests. If the version is the last one that was associated with a resource definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var ResourceDefinitionVersionId: __string
}

object GetResourceDefinitionVersionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: __string, ResourceDefinitionVersionId: __string): GetResourceDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId, ResourceDefinitionVersionId = ResourceDefinitionVersionId)
  
    __obj.asInstanceOf[GetResourceDefinitionVersionRequest]
  }
}

