package typings.aliApp.anon

import typings.aliApp.aliAppStrings.`4000`
import typings.aliApp.aliAppStrings.`6001`
import typings.aliApp.aliAppStrings.`6002`
import typings.aliApp.aliAppStrings.`9000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultStatus extends StObject {
  
  var result: Admitstate
  
  /**
    * 6001    用户取消了业务流程
    * 6002    网络异常
    * 9000    成功
    * 4000    系统异常
    */
  var resultStatus: `6001` | `6002` | `9000` | `4000` | String
}
object ResultStatus {
  
  inline def apply(result: Admitstate, resultStatus: `6001` | `6002` | `9000` | `4000` | String): ResultStatus = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStatus]
  }
  
  extension [Self <: ResultStatus](x: Self) {
    
    inline def setResult(value: Admitstate): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultStatus(value: `6001` | `6002` | `9000` | `4000` | String): Self = StObject.set(x, "resultStatus", value.asInstanceOf[js.Any])
  }
}
