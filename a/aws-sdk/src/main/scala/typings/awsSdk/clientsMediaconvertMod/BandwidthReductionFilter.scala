package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandwidthReductionFilter extends StObject {
  
  /**
    * Optionally specify the level of sharpening to apply when you use the Bandwidth reduction filter. Sharpening adds contrast to the edges of your video content and can reduce softness. Keep the default value Off to apply no sharpening. Set Sharpening strength to Low to apply a minimal amount of sharpening, or High to apply a maximum amount of sharpening.
    */
  var Sharpening: js.UndefOr[BandwidthReductionFilterSharpening] = js.undefined
  
  /**
    * Specify the strength of the Bandwidth reduction filter. For most workflows, we recommend that you choose Auto to reduce the bandwidth of your output with little to no perceptual decrease in video quality. For high quality and high bitrate outputs, choose Low. For the most bandwidth reduction, choose High. We recommend that you choose High for low bitrate outputs. Note that High may incur a slight increase in the softness of your output.
    */
  var Strength: js.UndefOr[BandwidthReductionFilterStrength] = js.undefined
}
object BandwidthReductionFilter {
  
  inline def apply(): BandwidthReductionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandwidthReductionFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BandwidthReductionFilter] (val x: Self) extends AnyVal {
    
    inline def setSharpening(value: BandwidthReductionFilterSharpening): Self = StObject.set(x, "Sharpening", value.asInstanceOf[js.Any])
    
    inline def setSharpeningUndefined: Self = StObject.set(x, "Sharpening", js.undefined)
    
    inline def setStrength(value: BandwidthReductionFilterStrength): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
