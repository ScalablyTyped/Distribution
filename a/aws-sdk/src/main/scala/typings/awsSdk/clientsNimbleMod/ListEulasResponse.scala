package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEulasResponse extends StObject {
  
  /**
    * A collection of EULA resources.
    */
  var eulas: js.UndefOr[EulaList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEulasResponse {
  
  inline def apply(): ListEulasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEulasResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEulasResponse] (val x: Self) extends AnyVal {
    
    inline def setEulas(value: EulaList): Self = StObject.set(x, "eulas", value.asInstanceOf[js.Any])
    
    inline def setEulasUndefined: Self = StObject.set(x, "eulas", js.undefined)
    
    inline def setEulasVarargs(value: Eula*): Self = StObject.set(x, "eulas", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
