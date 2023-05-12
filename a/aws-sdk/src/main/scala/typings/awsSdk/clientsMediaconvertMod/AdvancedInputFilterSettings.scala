package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedInputFilterSettings extends StObject {
  
  /**
    * Add texture and detail to areas of your input video content that were lost after applying the Advanced input filter. To adaptively add texture and reduce softness: Choose Enabled. To not add any texture: Keep the default value, Disabled. We recommend that you choose Disabled for input video content that doesn't have texture, including screen recordings, computer graphics, or cartoons.
    */
  var AddTexture: js.UndefOr[AdvancedInputFilterAddTexture] = js.undefined
  
  /**
    * Optionally specify the amount of sharpening to apply when you use the Advanced input filter. Sharpening adds contrast to the edges of your video content and can reduce softness. To apply no sharpening: Keep the default value, Off. To apply a minimal amount of sharpening choose Low, or for the maximum choose High.
    */
  var Sharpening: js.UndefOr[AdvancedInputFilterSharpen] = js.undefined
}
object AdvancedInputFilterSettings {
  
  inline def apply(): AdvancedInputFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedInputFilterSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedInputFilterSettings] (val x: Self) extends AnyVal {
    
    inline def setAddTexture(value: AdvancedInputFilterAddTexture): Self = StObject.set(x, "AddTexture", value.asInstanceOf[js.Any])
    
    inline def setAddTextureUndefined: Self = StObject.set(x, "AddTexture", js.undefined)
    
    inline def setSharpening(value: AdvancedInputFilterSharpen): Self = StObject.set(x, "Sharpening", value.asInstanceOf[js.Any])
    
    inline def setSharpeningUndefined: Self = StObject.set(x, "Sharpening", js.undefined)
  }
}
