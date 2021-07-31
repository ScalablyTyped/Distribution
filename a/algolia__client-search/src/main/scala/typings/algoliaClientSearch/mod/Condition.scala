package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.contains
import typings.algoliaClientSearch.algoliaClientSearchStrings.endsWith
import typings.algoliaClientSearch.algoliaClientSearchStrings.is
import typings.algoliaClientSearch.algoliaClientSearchStrings.startsWith
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * If set to true, alternatives make the rule to trigger on synonyms, typos and plurals.
    * Note that setting ignorePlurals to false overrides this parameter.
    */
  val alternatives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * is | startsWith | endsWith | contains: Whether the pattern must match the beginning or the end of the query string, or both, or none.
    */
  val anchoring: js.UndefOr[is | startsWith | endsWith | contains] = js.undefined
  
  /**
    * Rule context (format: [A-Za-z0-9_-]+). When specified, the rule is contextual and applies only when the same context is specified at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies (provided that its other conditions are met, of course).
    */
  val context: js.UndefOr[String] = js.undefined
  
  /**
    * Query patterns are expressed as a string with a specific syntax. A pattern is a sequence of tokens.
    */
  val pattern: js.UndefOr[String] = js.undefined
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: Boolean): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setAnchoring(value: is | startsWith | endsWith | contains): Self = StObject.set(x, "anchoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchoringUndefined: Self = StObject.set(x, "anchoring", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
