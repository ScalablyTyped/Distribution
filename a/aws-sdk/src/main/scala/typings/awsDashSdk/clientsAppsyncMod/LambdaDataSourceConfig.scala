package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaDataSourceConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var lambdaFunctionArn: String
}

object LambdaDataSourceConfig {
  @scala.inline
  def apply(lambdaFunctionArn: String): LambdaDataSourceConfig = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn)
  
    __obj.asInstanceOf[LambdaDataSourceConfig]
  }
}

