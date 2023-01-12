package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerNodeEndpoint extends StObject {
  
  /**
    * The address of the node endpoint
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * The port of the node endpoint
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
}
object CustomerNodeEndpoint {
  
  inline def apply(): CustomerNodeEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerNodeEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerNodeEndpoint] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
