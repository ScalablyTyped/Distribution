package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IThemeHues extends StObject {
  
  var default: js.UndefOr[String] = js.undefined
  
  var `hue-1`: js.UndefOr[String] = js.undefined
  
  var `hue-2`: js.UndefOr[String] = js.undefined
  
  var `hue-3`: js.UndefOr[String] = js.undefined
}
object IThemeHues {
  
  @scala.inline
  def apply(): IThemeHues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeHues]
  }
  
  @scala.inline
  implicit class IThemeHuesMutableBuilder[Self <: IThemeHues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def `setHue-1`(value: String): Self = StObject.set(x, "hue-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHue-1Undefined`: Self = StObject.set(x, "hue-1", js.undefined)
    
    @scala.inline
    def `setHue-2`(value: String): Self = StObject.set(x, "hue-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHue-2Undefined`: Self = StObject.set(x, "hue-2", js.undefined)
    
    @scala.inline
    def `setHue-3`(value: String): Self = StObject.set(x, "hue-3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHue-3Undefined`: Self = StObject.set(x, "hue-3", js.undefined)
  }
}
