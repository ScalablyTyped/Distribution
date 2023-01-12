package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkgroupRequest extends StObject {
  
  /**
    * The name of the workgroup to be deleted.
    */
  var workgroupName: WorkgroupName
}
object DeleteWorkgroupRequest {
  
  inline def apply(workgroupName: WorkgroupName): DeleteWorkgroupRequest = {
    val __obj = js.Dynamic.literal(workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkgroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteWorkgroupRequest] (val x: Self) extends AnyVal {
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
