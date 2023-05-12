package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordMatchConfiguration extends StObject {
  
  /**
    * The keywords or phrases that you want to match.
    */
  var Keywords: KeywordMatchWordList
  
  /**
    * Matches keywords or phrases on their presence or absence. If set to TRUE, the rule matches when all the specified keywords or phrases are absent. Default: FALSE.
    */
  var Negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the keyword match rule.
    */
  var RuleName: typings.awsSdk.clientsChimesdkmediapipelinesMod.RuleName
}
object KeywordMatchConfiguration {
  
  inline def apply(Keywords: KeywordMatchWordList, RuleName: RuleName): KeywordMatchConfiguration = {
    val __obj = js.Dynamic.literal(Keywords = Keywords.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordMatchConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeywordMatchConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKeywords(value: KeywordMatchWordList): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsVarargs(value: Keyword*): Self = StObject.set(x, "Keywords", js.Array(value*))
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "Negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "Negate", js.undefined)
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
  }
}
