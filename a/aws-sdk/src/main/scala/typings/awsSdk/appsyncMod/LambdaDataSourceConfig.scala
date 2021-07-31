package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaDataSourceConfig extends StObject {
  
  /**
    * The ARN for the Lambda function.
    */
  var lambdaFunctionArn: String
}
object LambdaDataSourceConfig {
  
  @scala.inline
  def apply(lambdaFunctionArn: String): LambdaDataSourceConfig = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaDataSourceConfig]
  }
  
  @scala.inline
  implicit class LambdaDataSourceConfigMutableBuilder[Self <: LambdaDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLambdaFunctionArn(value: String): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
  }
}
