package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: string
}
object DescribeConfigurationRequest {
  
  inline def apply(Arn: string): DescribeConfigurationRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRequest]
  }
  
  extension [Self <: DescribeConfigurationRequest](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
