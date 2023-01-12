package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptEulasResponse extends StObject {
  
  /**
    * A collection of EULA acceptances.
    */
  var eulaAcceptances: js.UndefOr[EulaAcceptanceList] = js.undefined
}
object AcceptEulasResponse {
  
  inline def apply(): AcceptEulasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptEulasResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptEulasResponse] (val x: Self) extends AnyVal {
    
    inline def setEulaAcceptances(value: EulaAcceptanceList): Self = StObject.set(x, "eulaAcceptances", value.asInstanceOf[js.Any])
    
    inline def setEulaAcceptancesUndefined: Self = StObject.set(x, "eulaAcceptances", js.undefined)
    
    inline def setEulaAcceptancesVarargs(value: EulaAcceptance*): Self = StObject.set(x, "eulaAcceptances", js.Array(value*))
  }
}
