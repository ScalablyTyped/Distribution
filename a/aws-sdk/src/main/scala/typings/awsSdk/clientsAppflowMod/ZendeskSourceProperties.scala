package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZendeskSourceProperties extends StObject {
  
  /**
    *  The object specified in the Zendesk flow source. 
    */
  var `object`: Object
}
object ZendeskSourceProperties {
  
  inline def apply(`object`: Object): ZendeskSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZendeskSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZendeskSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
