package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServerStrategiesResponse extends StObject {
  
  /**
    *  A list of strategy recommendations for the server. 
    */
  var serverStrategies: js.UndefOr[ServerStrategies] = js.undefined
}
object GetServerStrategiesResponse {
  
  inline def apply(): GetServerStrategiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServerStrategiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServerStrategiesResponse] (val x: Self) extends AnyVal {
    
    inline def setServerStrategies(value: ServerStrategies): Self = StObject.set(x, "serverStrategies", value.asInstanceOf[js.Any])
    
    inline def setServerStrategiesUndefined: Self = StObject.set(x, "serverStrategies", js.undefined)
    
    inline def setServerStrategiesVarargs(value: ServerStrategy*): Self = StObject.set(x, "serverStrategies", js.Array(value*))
  }
}
