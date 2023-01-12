package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterApplicationOutput extends StObject {
  
  /**
    * 
    */
  var Application: js.UndefOr[typings.awsSdk.clientsSsmsapMod.Application] = js.undefined
  
  /**
    * 
    */
  var OperationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.OperationId] = js.undefined
}
object RegisterApplicationOutput {
  
  inline def apply(): RegisterApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterApplicationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterApplicationOutput] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
