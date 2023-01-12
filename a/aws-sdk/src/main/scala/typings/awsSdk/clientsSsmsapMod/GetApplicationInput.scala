package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationInput extends StObject {
  
  /**
    * 
    */
  var ApplicationArn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * 
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.clientsSsmsapMod.ApplicationId] = js.undefined
}
object GetApplicationInput {
  
  inline def apply(): GetApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationArn(value: SsmSapArn): Self = StObject.set(x, "ApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "ApplicationArn", js.undefined)
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
  }
}
