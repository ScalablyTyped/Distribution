package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataStorage extends StObject {
  
  /**
    * A structure that contains the information about whether the app monitor stores copies of the data that RUM collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
    */
  var CwLog: js.UndefOr[typings.awsSdk.clientsRumMod.CwLog] = js.undefined
}
object DataStorage {
  
  inline def apply(): DataStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataStorage]
  }
  
  extension [Self <: DataStorage](x: Self) {
    
    inline def setCwLog(value: CwLog): Self = StObject.set(x, "CwLog", value.asInstanceOf[js.Any])
    
    inline def setCwLogUndefined: Self = StObject.set(x, "CwLog", js.undefined)
  }
}
