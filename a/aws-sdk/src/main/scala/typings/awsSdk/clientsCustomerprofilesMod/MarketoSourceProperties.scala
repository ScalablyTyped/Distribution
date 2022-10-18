package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketoSourceProperties extends StObject {
  
  /**
    * The object specified in the Marketo flow source.
    */
  var Object: typings.awsSdk.clientsCustomerprofilesMod.Object
}
object MarketoSourceProperties {
  
  inline def apply(Object: Object): MarketoSourceProperties = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketoSourceProperties]
  }
  
  extension [Self <: MarketoSourceProperties](x: Self) {
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
  }
}
