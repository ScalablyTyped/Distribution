package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceErrorInfo extends StObject {
  
  /**
    * Error message.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * Error type.
    */
  var Type: js.UndefOr[DataSourceErrorInfoType] = js.undefined
}
object DataSourceErrorInfo {
  
  inline def apply(): DataSourceErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceErrorInfo]
  }
  
  extension [Self <: DataSourceErrorInfo](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: DataSourceErrorInfoType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
