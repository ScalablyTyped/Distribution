package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailBlanking extends StObject {
  
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG] = js.undefined
}
object AvailBlanking {
  
  inline def apply(): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailBlanking]
  }
  
  extension [Self <: AvailBlanking](x: Self) {
    
    inline def setAvailBlankingImage(value: stringMin14PatternS3BmpBMPPngPNGHttpsBmpBMPPngPNG): Self = StObject.set(x, "AvailBlankingImage", value.asInstanceOf[js.Any])
    
    inline def setAvailBlankingImageUndefined: Self = StObject.set(x, "AvailBlankingImage", js.undefined)
  }
}
