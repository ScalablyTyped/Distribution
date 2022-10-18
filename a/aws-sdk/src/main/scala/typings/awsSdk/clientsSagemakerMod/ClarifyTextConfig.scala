package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClarifyTextConfig extends StObject {
  
  /**
    * The unit of granularity for the analysis of text features. For example, if the unit is 'token', then each token (like a word in English) of the text is treated as a feature. SHAP values are computed for each unit/feature.
    */
  var Granularity: ClarifyTextGranularity
  
  /**
    * Specifies the language of the text features in ISO 639-1 or ISO 639-3 code of a supported language.   For a mix of multiple languages, use code 'xx'. 
    */
  var Language: ClarifyTextLanguage
}
object ClarifyTextConfig {
  
  inline def apply(Granularity: ClarifyTextGranularity, Language: ClarifyTextLanguage): ClarifyTextConfig = {
    val __obj = js.Dynamic.literal(Granularity = Granularity.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClarifyTextConfig]
  }
  
  extension [Self <: ClarifyTextConfig](x: Self) {
    
    inline def setGranularity(value: ClarifyTextGranularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: ClarifyTextLanguage): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
  }
}
