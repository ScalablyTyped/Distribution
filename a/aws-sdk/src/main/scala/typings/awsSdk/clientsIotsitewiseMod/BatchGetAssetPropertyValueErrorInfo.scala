package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueErrorInfo extends StObject {
  
  /**
    * The error code.
    */
  var errorCode: BatchGetAssetPropertyValueErrorCode
  
  /**
    * The date the error occurred, in Unix epoch time.
    */
  var errorTimestamp: js.Date
}
object BatchGetAssetPropertyValueErrorInfo {
  
  inline def apply(errorCode: BatchGetAssetPropertyValueErrorCode, errorTimestamp: js.Date): BatchGetAssetPropertyValueErrorInfo = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorTimestamp = errorTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueErrorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetAssetPropertyValueErrorInfo] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: BatchGetAssetPropertyValueErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorTimestamp(value: js.Date): Self = StObject.set(x, "errorTimestamp", value.asInstanceOf[js.Any])
  }
}
