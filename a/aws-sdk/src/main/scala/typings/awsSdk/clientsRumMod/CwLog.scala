package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CwLog extends StObject {
  
  /**
    * Indicated whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs.
    */
  var CwLogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the log group where the copies are stored.
    */
  var CwLogGroup: js.UndefOr[String] = js.undefined
}
object CwLog {
  
  inline def apply(): CwLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CwLog]
  }
  
  extension [Self <: CwLog](x: Self) {
    
    inline def setCwLogEnabled(value: Boolean): Self = StObject.set(x, "CwLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setCwLogEnabledUndefined: Self = StObject.set(x, "CwLogEnabled", js.undefined)
    
    inline def setCwLogGroup(value: String): Self = StObject.set(x, "CwLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCwLogGroupUndefined: Self = StObject.set(x, "CwLogGroup", js.undefined)
  }
}
