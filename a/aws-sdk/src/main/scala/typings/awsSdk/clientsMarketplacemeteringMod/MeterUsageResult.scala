package typings.awsSdk.clientsMarketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeterUsageResult extends StObject {
  
  /**
    * Metering record id.
    */
  var MeteringRecordId: js.UndefOr[String] = js.undefined
}
object MeterUsageResult {
  
  inline def apply(): MeterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterUsageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeterUsageResult] (val x: Self) extends AnyVal {
    
    inline def setMeteringRecordId(value: String): Self = StObject.set(x, "MeteringRecordId", value.asInstanceOf[js.Any])
    
    inline def setMeteringRecordIdUndefined: Self = StObject.set(x, "MeteringRecordId", js.undefined)
  }
}
