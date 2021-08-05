package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ConsequenceParamsPickSear
import typings.algoliaClientSearch.anon.ObjectID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Consequence extends StObject {
  
  /**
    * Whether the Query Rule should promote or not promoted items.
    */
  val filterPromotes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Objects to hide from hits.
    */
  val hide: js.UndefOr[js.Array[ObjectID]] = js.undefined
  
  /**
    * Additional search parameters. Any valid search parameter is allowed.
    */
  val params: js.UndefOr[ConsequenceParamsPickSear] = js.undefined
  
  /**
    * Objects to promote as hits.
    */
  val promote: js.UndefOr[js.Array[ConsequencePromote]] = js.undefined
  
  /**
    * Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  val userData: js.UndefOr[js.Any] = js.undefined
}
object Consequence {
  
  inline def apply(): Consequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Consequence]
  }
  
  extension [Self <: Consequence](x: Self) {
    
    inline def setFilterPromotes(value: Boolean): Self = StObject.set(x, "filterPromotes", value.asInstanceOf[js.Any])
    
    inline def setFilterPromotesUndefined: Self = StObject.set(x, "filterPromotes", js.undefined)
    
    inline def setHide(value: js.Array[ObjectID]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHideVarargs(value: ObjectID*): Self = StObject.set(x, "hide", js.Array(value :_*))
    
    inline def setParams(value: ConsequenceParamsPickSear): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPromote(value: js.Array[ConsequencePromote]): Self = StObject.set(x, "promote", value.asInstanceOf[js.Any])
    
    inline def setPromoteUndefined: Self = StObject.set(x, "promote", js.undefined)
    
    inline def setPromoteVarargs(value: ConsequencePromote*): Self = StObject.set(x, "promote", js.Array(value :_*))
    
    inline def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
