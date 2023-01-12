package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveSynonymsOptions extends StObject {
  
  /**
    * If the existing synonyms should be removed.
    */
  val clearExistingSynonyms: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the saved synonyms should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the existing synonyms should be removed.
    * @deprecated use clearExistingSynonyms
    */
  val replaceExistingSynonyms: js.UndefOr[Boolean] = js.undefined
}
object SaveSynonymsOptions {
  
  inline def apply(): SaveSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSynonymsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveSynonymsOptions] (val x: Self) extends AnyVal {
    
    inline def setClearExistingSynonyms(value: Boolean): Self = StObject.set(x, "clearExistingSynonyms", value.asInstanceOf[js.Any])
    
    inline def setClearExistingSynonymsUndefined: Self = StObject.set(x, "clearExistingSynonyms", js.undefined)
    
    inline def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    inline def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
    
    inline def setReplaceExistingSynonyms(value: Boolean): Self = StObject.set(x, "replaceExistingSynonyms", value.asInstanceOf[js.Any])
    
    inline def setReplaceExistingSynonymsUndefined: Self = StObject.set(x, "replaceExistingSynonyms", js.undefined)
  }
}
