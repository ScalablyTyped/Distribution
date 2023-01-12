package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceNowSourceProperties extends StObject {
  
  /**
    * The object specified in the ServiceNow flow source.
    */
  var Object: typings.awsSdk.clientsCustomerprofilesMod.Object
}
object ServiceNowSourceProperties {
  
  inline def apply(Object: Object): ServiceNowSourceProperties = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceNowSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
  }
}
