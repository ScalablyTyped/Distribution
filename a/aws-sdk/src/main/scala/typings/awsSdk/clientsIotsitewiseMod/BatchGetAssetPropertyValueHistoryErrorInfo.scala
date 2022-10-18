package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueHistoryErrorInfo extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: BatchGetAssetPropertyValueHistoryErrorCode
  
  /**
    * The date the error occurred, in Unix epoch time.
    */
  var errorTimestamp: js.Date
}
object BatchGetAssetPropertyValueHistoryErrorInfo {
  
  inline def apply(errorCode: BatchGetAssetPropertyValueHistoryErrorCode, errorTimestamp: js.Date): BatchGetAssetPropertyValueHistoryErrorInfo = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorTimestamp = errorTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueHistoryErrorInfo]
  }
  
  extension [Self <: BatchGetAssetPropertyValueHistoryErrorInfo](x: Self) {
    
    inline def setErrorCode(value: BatchGetAssetPropertyValueHistoryErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorTimestamp(value: js.Date): Self = StObject.set(x, "errorTimestamp", value.asInstanceOf[js.Any])
  }
}
