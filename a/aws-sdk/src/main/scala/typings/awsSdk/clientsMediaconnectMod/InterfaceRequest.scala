package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceRequest extends StObject {
  
  /**
    * The name of the VPC interface.
    */
  var Name: string
}
object InterfaceRequest {
  
  inline def apply(Name: string): InterfaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterfaceRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
