package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnalyzerRequest extends StObject {
  
  /**
    * The name of the analyzer to create.
    */
  var analyzerName: Name
  
  /**
    * Specifies the archive rules to add for the analyzer. Archive rules automatically archive findings that meet the criteria you define for the rule.
    */
  var archiveRules: js.UndefOr[InlineArchiveRulesList] = js.undefined
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the analyzer.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * The type of analyzer to create. Only ACCOUNT and ORGANIZATION analyzers are supported. You can create only one analyzer per account per Region. You can create up to 5 analyzers per organization per Region.
    */
  var `type`: Type
}
object CreateAnalyzerRequest {
  
  inline def apply(analyzerName: Name, `type`: Type): CreateAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalyzerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnalyzerRequest] (val x: Self) extends AnyVal {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setArchiveRules(value: InlineArchiveRulesList): Self = StObject.set(x, "archiveRules", value.asInstanceOf[js.Any])
    
    inline def setArchiveRulesUndefined: Self = StObject.set(x, "archiveRules", js.undefined)
    
    inline def setArchiveRulesVarargs(value: InlineArchiveRule*): Self = StObject.set(x, "archiveRules", js.Array(value*))
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
