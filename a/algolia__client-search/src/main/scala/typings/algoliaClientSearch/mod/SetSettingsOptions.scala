package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSettingsOptions extends StObject {
  
  /**
    * If the saved settings should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object SetSettingsOptions {
  
  inline def apply(): SetSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSettingsOptions]
  }
  
  extension [Self <: SetSettingsOptions](x: Self) {
    
    inline def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    inline def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
