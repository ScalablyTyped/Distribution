package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupVersionRequest extends StObject {
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
  
  /**
    * The ID of the group version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding ''GroupInformation'' object.
    */
  var GroupVersionId: string
}
object GetGroupVersionRequest {
  
  inline def apply(GroupId: string, GroupVersionId: string): GetGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], GroupVersionId = GroupVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupVersionId(value: string): Self = StObject.set(x, "GroupVersionId", value.asInstanceOf[js.Any])
  }
}
