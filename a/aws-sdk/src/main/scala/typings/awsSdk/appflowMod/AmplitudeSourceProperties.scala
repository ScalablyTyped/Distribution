package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmplitudeSourceProperties extends StObject {
  
  /**
    *  The object specified in the Amplitude flow source. 
    */
  var `object`: Object = js.native
}
object AmplitudeSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): AmplitudeSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmplitudeSourceProperties]
  }
  
  @scala.inline
  implicit class AmplitudeSourcePropertiesMutableBuilder[Self <: AmplitudeSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
