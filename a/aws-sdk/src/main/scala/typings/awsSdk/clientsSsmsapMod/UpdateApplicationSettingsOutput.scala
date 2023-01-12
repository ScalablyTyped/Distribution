package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationSettingsOutput extends StObject {
  
  /**
    * 
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var OperationIds: js.UndefOr[OperationIdList] = js.undefined
}
object UpdateApplicationSettingsOutput {
  
  inline def apply(): UpdateApplicationSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApplicationSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOperationIds(value: OperationIdList): Self = StObject.set(x, "OperationIds", value.asInstanceOf[js.Any])
    
    inline def setOperationIdsUndefined: Self = StObject.set(x, "OperationIds", js.undefined)
    
    inline def setOperationIdsVarargs(value: OperationId*): Self = StObject.set(x, "OperationIds", js.Array(value*))
  }
}
