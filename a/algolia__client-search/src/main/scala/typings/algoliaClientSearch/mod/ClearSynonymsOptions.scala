package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSynonymsOptions extends StObject {
  
  /**
    * If the clear synonyms request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object ClearSynonymsOptions {
  
  inline def apply(): ClearSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearSynonymsOptions]
  }
  
  extension [Self <: ClearSynonymsOptions](x: Self) {
    
    inline def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    inline def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
