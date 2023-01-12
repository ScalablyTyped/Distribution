package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearRulesOptions extends StObject {
  
  /**
    * If the clear rules request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object ClearRulesOptions {
  
  inline def apply(): ClearRulesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearRulesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearRulesOptions] (val x: Self) extends AnyVal {
    
    inline def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    inline def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
