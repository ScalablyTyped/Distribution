package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FinSpace environment that you created.
    */
  var environmentArn: js.UndefOr[EnvironmentArn] = js.undefined
  
  /**
    * The unique identifier for FinSpace environment that you created.
    */
  var environmentId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The sign-in url for the web application of the FinSpace environment you created.
    */
  var environmentUrl: js.UndefOr[url] = js.undefined
}
object CreateEnvironmentResponse {
  
  inline def apply(): CreateEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEnvironmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentArn(value: EnvironmentArn): Self = StObject.set(x, "environmentArn", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentArnUndefined: Self = StObject.set(x, "environmentArn", js.undefined)
    
    inline def setEnvironmentId(value: IdType): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "environmentId", js.undefined)
    
    inline def setEnvironmentUrl(value: url): Self = StObject.set(x, "environmentUrl", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUrlUndefined: Self = StObject.set(x, "environmentUrl", js.undefined)
  }
}
