package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageInserter extends StObject {
  
  /**
    * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
    */
  var InsertableImages: js.UndefOr[listOfInsertableImage] = js.undefined
}
object ImageInserter {
  
  inline def apply(): ImageInserter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageInserter]
  }
  
  extension [Self <: ImageInserter](x: Self) {
    
    inline def setInsertableImages(value: listOfInsertableImage): Self = StObject.set(x, "InsertableImages", value.asInstanceOf[js.Any])
    
    inline def setInsertableImagesUndefined: Self = StObject.set(x, "InsertableImages", js.undefined)
    
    inline def setInsertableImagesVarargs(value: InsertableImage*): Self = StObject.set(x, "InsertableImages", js.Array(value*))
  }
}
