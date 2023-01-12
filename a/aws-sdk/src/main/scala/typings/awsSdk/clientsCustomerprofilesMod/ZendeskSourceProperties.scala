package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZendeskSourceProperties extends StObject {
  
  /**
    * The object specified in the Zendesk flow source.
    */
  var Object: typings.awsSdk.clientsCustomerprofilesMod.Object
}
object ZendeskSourceProperties {
  
  inline def apply(Object: Object): ZendeskSourceProperties = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZendeskSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZendeskSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
  }
}
