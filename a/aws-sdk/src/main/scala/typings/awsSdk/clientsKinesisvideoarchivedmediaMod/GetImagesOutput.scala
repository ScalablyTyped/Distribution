package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImagesOutput extends StObject {
  
  /**
    * The list of images generated from the video stream. If there is no media available for the given timestamp, the NO_MEDIA error will be listed in the output. If an error occurs while the image is being generated, the MEDIA_ERROR will be listed in the output as the cause of the missing image. 
    */
  var Images: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.Images] = js.undefined
  
  /**
    * The encrypted token that was used in the request to get more images.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisvideoarchivedmediaMod.NextToken] = js.undefined
}
object GetImagesOutput {
  
  inline def apply(): GetImagesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImagesOutput]
  }
  
  extension [Self <: GetImagesOutput](x: Self) {
    
    inline def setImages(value: Images): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "Images", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
