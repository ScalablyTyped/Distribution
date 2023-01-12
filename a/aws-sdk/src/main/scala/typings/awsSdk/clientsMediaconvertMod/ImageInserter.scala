package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInserter extends StObject {
  
  /**
    * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
    */
  var InsertableImages: js.UndefOr[listOfInsertableImage] = js.undefined
  
  /**
    * Specify the reference white level, in nits, for all of your image inserter images. Use to correct brightness levels within HDR10 outputs. For 1,000 nit peak brightness displays, we recommend that you set SDR reference white level to 203 (according to ITU-R BT.2408). Leave blank to use the default value of 100, or specify an integer from 100 to 1000.
    */
  var SdrReferenceWhiteLevel: js.UndefOr[integerMin100Max1000] = js.undefined
}
object ImageInserter {
  
  inline def apply(): ImageInserter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageInserter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageInserter] (val x: Self) extends AnyVal {
    
    inline def setInsertableImages(value: listOfInsertableImage): Self = StObject.set(x, "InsertableImages", value.asInstanceOf[js.Any])
    
    inline def setInsertableImagesUndefined: Self = StObject.set(x, "InsertableImages", js.undefined)
    
    inline def setInsertableImagesVarargs(value: InsertableImage*): Self = StObject.set(x, "InsertableImages", js.Array(value*))
    
    inline def setSdrReferenceWhiteLevel(value: integerMin100Max1000): Self = StObject.set(x, "SdrReferenceWhiteLevel", value.asInstanceOf[js.Any])
    
    inline def setSdrReferenceWhiteLevelUndefined: Self = StObject.set(x, "SdrReferenceWhiteLevel", js.undefined)
  }
}
