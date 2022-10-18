package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVoicesInput extends StObject {
  
  /**
    * Specifies the engine (standard or neural) used by Amazon Polly when processing input text for speech synthesis. 
    */
  var Engine: js.UndefOr[typings.awsSdk.clientsPollyMod.Engine] = js.undefined
  
  /**
    * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you specify yes but not if you specify no.
    */
  var IncludeAdditionalLanguageCodes: js.UndefOr[typings.awsSdk.clientsPollyMod.IncludeAdditionalLanguageCodes] = js.undefined
  
  /**
    *  The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list of voices returned. If you don't specify this optional parameter, all available voices are returned. 
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsPollyMod.LanguageCode] = js.undefined
  
  /**
    * An opaque pagination token returned from the previous DescribeVoices operation. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPollyMod.NextToken] = js.undefined
}
object DescribeVoicesInput {
  
  inline def apply(): DescribeVoicesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVoicesInput]
  }
  
  extension [Self <: DescribeVoicesInput](x: Self) {
    
    inline def setEngine(value: Engine): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setIncludeAdditionalLanguageCodes(value: IncludeAdditionalLanguageCodes): Self = StObject.set(x, "IncludeAdditionalLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAdditionalLanguageCodesUndefined: Self = StObject.set(x, "IncludeAdditionalLanguageCodes", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
