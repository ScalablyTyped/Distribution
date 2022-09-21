package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.OmitSearchOptionsattribut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAnswersOptions extends StObject {
  
  /**
    * Attributes to use for predictions.
    * If using the default (["*"]), all attributes are used to find answers.
    */
  val attributesForPrediction: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of answers to retrieve from the Answers Engine.
    * Cannot be greater than 1000.
    */
  val nbHits: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the attribute name in which the answer was found should be returned.
    * This option is expensive in processing time.
    */
  val returnExtractAttribute: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Algolia search parameters to use to fetch the hits.
    * Can be any search parameter, except:
    *   - attributesToSnippet
    *   - hitsPerPage
    *   - queryType
    *   - naturalLanguages and associated parameters
    *     (removeStopWords, ignorePlurals, and removeWordsIfNoResults)
    */
  val searchParameters: js.UndefOr[OmitSearchOptionsattribut] = js.undefined
  
  /**
    * Threshold for the answers’ confidence score:
    * only answers with extracts that score above this threshold are returned.
    */
  val threshold: js.UndefOr[Double] = js.undefined
}
object FindAnswersOptions {
  
  inline def apply(): FindAnswersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAnswersOptions]
  }
  
  extension [Self <: FindAnswersOptions](x: Self) {
    
    inline def setAttributesForPrediction(value: js.Array[String]): Self = StObject.set(x, "attributesForPrediction", value.asInstanceOf[js.Any])
    
    inline def setAttributesForPredictionUndefined: Self = StObject.set(x, "attributesForPrediction", js.undefined)
    
    inline def setAttributesForPredictionVarargs(value: String*): Self = StObject.set(x, "attributesForPrediction", js.Array(value*))
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbHitsUndefined: Self = StObject.set(x, "nbHits", js.undefined)
    
    inline def setReturnExtractAttribute(value: Boolean): Self = StObject.set(x, "returnExtractAttribute", value.asInstanceOf[js.Any])
    
    inline def setReturnExtractAttributeUndefined: Self = StObject.set(x, "returnExtractAttribute", js.undefined)
    
    inline def setSearchParameters(value: OmitSearchOptionsattribut): Self = StObject.set(x, "searchParameters", value.asInstanceOf[js.Any])
    
    inline def setSearchParametersUndefined: Self = StObject.set(x, "searchParameters", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
