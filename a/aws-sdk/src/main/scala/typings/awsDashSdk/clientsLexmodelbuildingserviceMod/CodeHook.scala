package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeHook extends js.Object {
  /**
    * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more information, see using-lambda.
    */
  var messageVersion: MessageVersion
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: LambdaARN
}

object CodeHook {
  @scala.inline
  def apply(messageVersion: MessageVersion, uri: LambdaARN): CodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion, uri = uri)
  
    __obj.asInstanceOf[CodeHook]
  }
}

