package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlackSourceProperties extends StObject {
  
  /**
    *  The object specified in the Slack flow source. 
    */
  var `object`: Object
}
object SlackSourceProperties {
  
  inline def apply(`object`: Object): SlackSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlackSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlackSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
