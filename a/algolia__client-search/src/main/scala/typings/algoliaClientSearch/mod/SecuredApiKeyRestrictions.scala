package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuredApiKeyRestrictions
  extends StObject
     with SearchOptions {
  
  /**
    * List of index names that can be queried.
    */
  val restrictIndices: js.UndefOr[js.Array[String] | String] = js.undefined
  
  /**
    * IPv4 network allowed to use the generated key. This is used for more protection against API key leaking and reuse.
    */
  val restrictSources: js.UndefOr[String] = js.undefined
  
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val validUntil: js.UndefOr[Double] = js.undefined
}
object SecuredApiKeyRestrictions {
  
  inline def apply(): SecuredApiKeyRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuredApiKeyRestrictions]
  }
  
  extension [Self <: SecuredApiKeyRestrictions](x: Self) {
    
    inline def setRestrictIndices(value: js.Array[String] | String): Self = StObject.set(x, "restrictIndices", value.asInstanceOf[js.Any])
    
    inline def setRestrictIndicesUndefined: Self = StObject.set(x, "restrictIndices", js.undefined)
    
    inline def setRestrictIndicesVarargs(value: String*): Self = StObject.set(x, "restrictIndices", js.Array(value*))
    
    inline def setRestrictSources(value: String): Self = StObject.set(x, "restrictSources", value.asInstanceOf[js.Any])
    
    inline def setRestrictSourcesUndefined: Self = StObject.set(x, "restrictSources", js.undefined)
    
    inline def setValidUntil(value: Double): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
