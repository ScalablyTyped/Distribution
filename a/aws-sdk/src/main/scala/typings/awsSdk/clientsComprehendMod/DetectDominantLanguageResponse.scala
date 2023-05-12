package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectDominantLanguageResponse extends StObject {
  
  /**
    * Array of languages that Amazon Comprehend detected in the input text. The array is sorted in descending order of the score (the dominant language is always the first element in the array). For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
}
object DetectDominantLanguageResponse {
  
  inline def apply(): DetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectDominantLanguageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectDominantLanguageResponse] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: ListOfDominantLanguages): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
    
    inline def setLanguagesVarargs(value: DominantLanguage*): Self = StObject.set(x, "Languages", js.Array(value*))
  }
}
