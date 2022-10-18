package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaDataSourceConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the Lambda function.
    */
  var lambdaFunctionArn: String
}
object LambdaDataSourceConfig {
  
  inline def apply(lambdaFunctionArn: String): LambdaDataSourceConfig = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaDataSourceConfig]
  }
  
  extension [Self <: LambdaDataSourceConfig](x: Self) {
    
    inline def setLambdaFunctionArn(value: String): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
  }
}
