package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSuggesterOptions extends StObject {
  
  /**
    * The level of fuzziness allowed when suggesting matches for a string: none, low, or high. With none, the specified string is treated as an exact prefix. With low, suggestions must differ from the specified string by no more than one character. With high, suggestions can differ by up to two characters. The default is none. 
    */
  var FuzzyMatching: js.UndefOr[SuggesterFuzzyMatching] = js.undefined
  
  /**
    * An expression that computes a score for each suggestion to control how they are sorted. The scores are rounded to the nearest integer, with a floor of 0 and a ceiling of 2^31-1. A document's relevance score is not computed for suggestions, so sort expressions cannot reference the _score value. To sort suggestions using a numeric field or existing expression, simply specify the name of the field or expression. If no expression is configured for the suggester, the suggestions are sorted with the closest matches listed first.
    */
  var SortExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the index field you want to use for suggestions. 
    */
  var SourceField: FieldName
}
object DocumentSuggesterOptions {
  
  inline def apply(SourceField: FieldName): DocumentSuggesterOptions = {
    val __obj = js.Dynamic.literal(SourceField = SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSuggesterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSuggesterOptions] (val x: Self) extends AnyVal {
    
    inline def setFuzzyMatching(value: SuggesterFuzzyMatching): Self = StObject.set(x, "FuzzyMatching", value.asInstanceOf[js.Any])
    
    inline def setFuzzyMatchingUndefined: Self = StObject.set(x, "FuzzyMatching", js.undefined)
    
    inline def setSortExpression(value: String): Self = StObject.set(x, "SortExpression", value.asInstanceOf[js.Any])
    
    inline def setSortExpressionUndefined: Self = StObject.set(x, "SortExpression", js.undefined)
    
    inline def setSourceField(value: FieldName): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
  }
}
