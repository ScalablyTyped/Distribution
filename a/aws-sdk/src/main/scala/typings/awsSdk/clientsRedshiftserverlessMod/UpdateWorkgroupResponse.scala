package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkgroupResponse extends StObject {
  
  /**
    * The updated workgroup object.
    */
  var workgroup: Workgroup
}
object UpdateWorkgroupResponse {
  
  inline def apply(workgroup: Workgroup): UpdateWorkgroupResponse = {
    val __obj = js.Dynamic.literal(workgroup = workgroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkgroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkgroupResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkgroup(value: Workgroup): Self = StObject.set(x, "workgroup", value.asInstanceOf[js.Any])
  }
}
