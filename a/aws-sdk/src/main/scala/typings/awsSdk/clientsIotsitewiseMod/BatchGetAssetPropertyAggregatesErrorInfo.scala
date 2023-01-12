package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyAggregatesErrorInfo extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: BatchGetAssetPropertyAggregatesErrorCode
  
  /**
    * The date the error occurred, in Unix epoch time.
    */
  var errorTimestamp: js.Date
}
object BatchGetAssetPropertyAggregatesErrorInfo {
  
  inline def apply(errorCode: BatchGetAssetPropertyAggregatesErrorCode, errorTimestamp: js.Date): BatchGetAssetPropertyAggregatesErrorInfo = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorTimestamp = errorTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyAggregatesErrorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetAssetPropertyAggregatesErrorInfo] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: BatchGetAssetPropertyAggregatesErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorTimestamp(value: js.Date): Self = StObject.set(x, "errorTimestamp", value.asInstanceOf[js.Any])
  }
}
