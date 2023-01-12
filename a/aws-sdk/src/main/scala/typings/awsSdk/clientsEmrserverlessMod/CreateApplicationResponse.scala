package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * The output contains the application ID.
    */
  var applicationId: ApplicationId
  
  /**
    * The output contains the ARN of the application.
    */
  var arn: ApplicationArn
  
  /**
    * The output contains the name of the application.
    */
  var name: js.UndefOr[ApplicationName] = js.undefined
}
object CreateApplicationResponse {
  
  inline def apply(applicationId: ApplicationId, arn: ApplicationArn): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
