package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkerConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the worker configuration that you want to get information about.
    */
  var workerConfigurationArn: string
}
object DescribeWorkerConfigurationRequest {
  
  inline def apply(workerConfigurationArn: string): DescribeWorkerConfigurationRequest = {
    val __obj = js.Dynamic.literal(workerConfigurationArn = workerConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkerConfigurationRequest]
  }
  
  extension [Self <: DescribeWorkerConfigurationRequest](x: Self) {
    
    inline def setWorkerConfigurationArn(value: string): Self = StObject.set(x, "workerConfigurationArn", value.asInstanceOf[js.Any])
  }
}
