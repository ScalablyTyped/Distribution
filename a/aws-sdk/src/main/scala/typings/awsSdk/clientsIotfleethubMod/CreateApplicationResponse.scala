package typings.awsSdk.clientsIotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * The ARN of the web application.
    */
  var applicationArn: Arn
  
  /**
    * The unique Id of the web application.
    */
  var applicationId: Id
}
object CreateApplicationResponse {
  
  inline def apply(applicationArn: Arn, applicationId: Id): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationArn = applicationArn.asInstanceOf[js.Any], applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationArn(value: Arn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
  }
}
