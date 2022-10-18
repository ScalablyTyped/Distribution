package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration.
    
    */
  var Arn: string
}
object DeleteConfigurationRequest {
  
  inline def apply(Arn: string): DeleteConfigurationRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationRequest]
  }
  
  extension [Self <: DeleteConfigurationRequest](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
