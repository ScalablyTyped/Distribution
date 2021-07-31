package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveRulesOptions extends StObject {
  
  /**
    * If the existing rules should be removed.
    */
  val clearExistingRules: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the saved rules should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object SaveRulesOptions {
  
  @scala.inline
  def apply(): SaveRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveRulesOptions]
  }
  
  @scala.inline
  implicit class SaveRulesOptionsMutableBuilder[Self <: SaveRulesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearExistingRules(value: Boolean): Self = StObject.set(x, "clearExistingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearExistingRulesUndefined: Self = StObject.set(x, "clearExistingRules", js.undefined)
    
    @scala.inline
    def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
