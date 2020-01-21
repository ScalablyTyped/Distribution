package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaDataSourceConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var lambdaFunctionArn: String = js.native
}

object LambdaDataSourceConfig {
  @scala.inline
  def apply(lambdaFunctionArn: String): LambdaDataSourceConfig = {
    val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LambdaDataSourceConfig]
  }
}

