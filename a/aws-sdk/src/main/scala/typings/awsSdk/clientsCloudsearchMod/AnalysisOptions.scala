package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisOptions extends StObject {
  
  /**
    * The level of algorithmic stemming to perform: none, minimal, light, or full. The available levels vary depending on the language. For more information, see Language Specific Text Processing Settings in the Amazon CloudSearch Developer Guide 
    */
  var AlgorithmicStemming: js.UndefOr[typings.awsSdk.clientsCloudsearchMod.AlgorithmicStemming] = js.undefined
  
  /**
    * A JSON array that contains a collection of terms, tokens, readings and part of speech for Japanese Tokenizaiton. The Japanese tokenization dictionary enables you to override the default tokenization for selected terms. This is only valid for Japanese language fields.
    */
  var JapaneseTokenizationDictionary: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON object that contains a collection of string:value pairs that each map a term to its stem. For example, {"term1": "stem1", "term2": "stem2", "term3": "stem3"}. The stemming dictionary is applied in addition to any algorithmic stemming. This enables you to override the results of the algorithmic stemming to correct specific cases of overstemming or understemming. The maximum size of a stemming dictionary is 500 KB.
    */
  var StemmingDictionary: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON array of terms to ignore during indexing and searching. For example, ["a", "an", "the", "of"]. The stopwords dictionary must explicitly list each word you want to ignore. Wildcards and regular expressions are not supported. 
    */
  var Stopwords: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON object that defines synonym groups and aliases. A synonym group is an array of arrays, where each sub-array is a group of terms where each term in the group is considered a synonym of every other term in the group. The aliases value is an object that contains a collection of string:value pairs where the string specifies a term and the array of values specifies each of the aliases for that term. An alias is considered a synonym of the specified term, but the term is not considered a synonym of the alias. For more information about specifying synonyms, see Synonyms in the Amazon CloudSearch Developer Guide.
    */
  var Synonyms: js.UndefOr[String] = js.undefined
}
object AnalysisOptions {
  
  inline def apply(): AnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmicStemming(value: AlgorithmicStemming): Self = StObject.set(x, "AlgorithmicStemming", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmicStemmingUndefined: Self = StObject.set(x, "AlgorithmicStemming", js.undefined)
    
    inline def setJapaneseTokenizationDictionary(value: String): Self = StObject.set(x, "JapaneseTokenizationDictionary", value.asInstanceOf[js.Any])
    
    inline def setJapaneseTokenizationDictionaryUndefined: Self = StObject.set(x, "JapaneseTokenizationDictionary", js.undefined)
    
    inline def setStemmingDictionary(value: String): Self = StObject.set(x, "StemmingDictionary", value.asInstanceOf[js.Any])
    
    inline def setStemmingDictionaryUndefined: Self = StObject.set(x, "StemmingDictionary", js.undefined)
    
    inline def setStopwords(value: String): Self = StObject.set(x, "Stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "Stopwords", js.undefined)
    
    inline def setSynonyms(value: String): Self = StObject.set(x, "Synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "Synonyms", js.undefined)
  }
}
