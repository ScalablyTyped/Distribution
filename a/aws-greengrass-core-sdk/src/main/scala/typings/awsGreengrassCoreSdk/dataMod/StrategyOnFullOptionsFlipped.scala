package typings.awsGreengrassCoreSdk.dataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.OverwriteOldestData
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.RejectNewData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategyOnFullOptionsFlipped extends StObject {
  
  var `0`: RejectNewData
  
  var `1`: OverwriteOldestData
}
object StrategyOnFullOptionsFlipped {
  
  inline def apply(): StrategyOnFullOptionsFlipped = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("RejectNewData")
    __obj.updateDynamic("1")("OverwriteOldestData")
    __obj.asInstanceOf[StrategyOnFullOptionsFlipped]
  }
  
  extension [Self <: StrategyOnFullOptionsFlipped](x: Self) {
    
    inline def set0(value: RejectNewData): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: OverwriteOldestData): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
