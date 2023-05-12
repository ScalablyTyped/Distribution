package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.RuleObjectID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectRuleIndexMetadata extends StObject {
  
  /**
    * Data for the redirect rule
    */
  val data: RuleObjectID
  
  /**
    * Destination index for the redirect rule
    */
  val dest: String
  
  /**
    * Reason for the redirect rule
    */
  val reason: String
  
  /**
    * Source index for the redirect rule
    */
  val source: String
  
  /**
    * Status for the redirect rule
    */
  val succeed: Boolean
}
object RedirectRuleIndexMetadata {
  
  inline def apply(data: RuleObjectID, dest: String, reason: String, source: String, succeed: Boolean): RedirectRuleIndexMetadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], succeed = succeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRuleIndexMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedirectRuleIndexMetadata] (val x: Self) extends AnyVal {
    
    inline def setData(value: RuleObjectID): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSucceed(value: Boolean): Self = StObject.set(x, "succeed", value.asInstanceOf[js.Any])
  }
}
