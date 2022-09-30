package typings.awsGreengrassCoreSdk.dataMod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`0`
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrategyOnFullOptions extends StObject {
  
  var OverwriteOldestData: `1`
  
  var RejectNewData: `0`
}
object StrategyOnFullOptions {
  
  inline def apply(): StrategyOnFullOptions = {
    val __obj = js.Dynamic.literal(OverwriteOldestData = 1, RejectNewData = 0)
    __obj.asInstanceOf[StrategyOnFullOptions]
  }
  
  extension [Self <: StrategyOnFullOptions](x: Self) {
    
    inline def setOverwriteOldestData(value: `1`): Self = StObject.set(x, "OverwriteOldestData", value.asInstanceOf[js.Any])
    
    inline def setRejectNewData(value: `0`): Self = StObject.set(x, "RejectNewData", value.asInstanceOf[js.Any])
  }
}
