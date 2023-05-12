package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordCloudOptions extends StObject {
  
  /**
    * The cloud layout options (fluid, normal) of a word cloud.
    */
  var CloudLayout: js.UndefOr[WordCloudCloudLayout] = js.undefined
  
  /**
    * The length limit of each word from 1-100.
    */
  var MaximumStringLength: js.UndefOr[WordCloudMaximumStringLength] = js.undefined
  
  /**
    * The word casing options (lower_case, existing_case) for the words in a word cloud.
    */
  var WordCasing: js.UndefOr[WordCloudWordCasing] = js.undefined
  
  /**
    * The word orientation options (horizontal, horizontal_and_vertical) for the words in a word cloud.
    */
  var WordOrientation: js.UndefOr[WordCloudWordOrientation] = js.undefined
  
  /**
    * The word padding options (none, small, medium, large) for the words in a word cloud.
    */
  var WordPadding: js.UndefOr[WordCloudWordPadding] = js.undefined
  
  /**
    * The word scaling options (emphasize, normal) for the words in a word cloud.
    */
  var WordScaling: js.UndefOr[WordCloudWordScaling] = js.undefined
}
object WordCloudOptions {
  
  inline def apply(): WordCloudOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordCloudOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordCloudOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudLayout(value: WordCloudCloudLayout): Self = StObject.set(x, "CloudLayout", value.asInstanceOf[js.Any])
    
    inline def setCloudLayoutUndefined: Self = StObject.set(x, "CloudLayout", js.undefined)
    
    inline def setMaximumStringLength(value: WordCloudMaximumStringLength): Self = StObject.set(x, "MaximumStringLength", value.asInstanceOf[js.Any])
    
    inline def setMaximumStringLengthUndefined: Self = StObject.set(x, "MaximumStringLength", js.undefined)
    
    inline def setWordCasing(value: WordCloudWordCasing): Self = StObject.set(x, "WordCasing", value.asInstanceOf[js.Any])
    
    inline def setWordCasingUndefined: Self = StObject.set(x, "WordCasing", js.undefined)
    
    inline def setWordOrientation(value: WordCloudWordOrientation): Self = StObject.set(x, "WordOrientation", value.asInstanceOf[js.Any])
    
    inline def setWordOrientationUndefined: Self = StObject.set(x, "WordOrientation", js.undefined)
    
    inline def setWordPadding(value: WordCloudWordPadding): Self = StObject.set(x, "WordPadding", value.asInstanceOf[js.Any])
    
    inline def setWordPaddingUndefined: Self = StObject.set(x, "WordPadding", js.undefined)
    
    inline def setWordScaling(value: WordCloudWordScaling): Self = StObject.set(x, "WordScaling", value.asInstanceOf[js.Any])
    
    inline def setWordScalingUndefined: Self = StObject.set(x, "WordScaling", js.undefined)
  }
}
