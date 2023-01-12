package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesInRecycleBinResult extends StObject {
  
  /**
    * Information about the AMIs.
    */
  var Images: js.UndefOr[ImageRecycleBinInfoList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListImagesInRecycleBinResult {
  
  inline def apply(): ListImagesInRecycleBinResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesInRecycleBinResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImagesInRecycleBinResult] (val x: Self) extends AnyVal {
    
    inline def setImages(value: ImageRecycleBinInfoList): Self = StObject.set(x, "Images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "Images", js.undefined)
    
    inline def setImagesVarargs(value: ImageRecycleBinInfo*): Self = StObject.set(x, "Images", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
