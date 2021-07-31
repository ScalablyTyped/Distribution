package typings.awsSdk.appflowMod

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
  
  @scala.inline
  def apply(`object`: Object): ZendeskSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZendeskSourceProperties]
  }
  
  @scala.inline
  implicit class ZendeskSourcePropertiesMutableBuilder[Self <: ZendeskSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
