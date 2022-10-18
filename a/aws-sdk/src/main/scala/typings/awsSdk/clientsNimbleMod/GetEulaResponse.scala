package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEulaResponse extends StObject {
  
  /**
    * The EULA.
    */
  var eula: js.UndefOr[Eula] = js.undefined
}
object GetEulaResponse {
  
  inline def apply(): GetEulaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEulaResponse]
  }
  
  extension [Self <: GetEulaResponse](x: Self) {
    
    inline def setEula(value: Eula): Self = StObject.set(x, "eula", value.asInstanceOf[js.Any])
    
    inline def setEulaUndefined: Self = StObject.set(x, "eula", js.undefined)
  }
}
