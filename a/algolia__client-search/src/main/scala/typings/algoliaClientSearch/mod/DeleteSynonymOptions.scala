package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSynonymOptions extends StObject {
  
  /**
    * If the delete synonym request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object DeleteSynonymOptions {
  
  @scala.inline
  def apply(): DeleteSynonymOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSynonymOptions]
  }
  
  @scala.inline
  implicit class DeleteSynonymOptionsMutableBuilder[Self <: DeleteSynonymOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
