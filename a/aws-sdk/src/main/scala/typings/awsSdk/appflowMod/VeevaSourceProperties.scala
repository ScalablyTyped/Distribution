package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VeevaSourceProperties extends StObject {
  
  /**
    *  The object specified in the Veeva flow source. 
    */
  var `object`: Object = js.native
}
object VeevaSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): VeevaSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaSourceProperties]
  }
  
  @scala.inline
  implicit class VeevaSourcePropertiesMutableBuilder[Self <: VeevaSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
