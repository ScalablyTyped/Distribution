package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackTestConfiguration extends StObject {
  
  /**
    * Run a backtest instead of monitoring new data.
    */
  var RunBackTestMode: Boolean
}
object BackTestConfiguration {
  
  inline def apply(RunBackTestMode: Boolean): BackTestConfiguration = {
    val __obj = js.Dynamic.literal(RunBackTestMode = RunBackTestMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackTestConfiguration]
  }
  
  extension [Self <: BackTestConfiguration](x: Self) {
    
    inline def setRunBackTestMode(value: Boolean): Self = StObject.set(x, "RunBackTestMode", value.asInstanceOf[js.Any])
  }
}
