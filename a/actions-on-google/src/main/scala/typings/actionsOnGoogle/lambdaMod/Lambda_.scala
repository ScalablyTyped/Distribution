package typings.actionsOnGoogle.lambdaMod

import typings.actionsOnGoogle.frameworkFrameworkMod.Framework
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/framework/lambda", "Lambda")
@js.native
class Lambda_ () extends Framework[LambdaHandler] {
  
  def check(first: js.Object, second: js.Object, third: js.Object): Boolean = js.native
  
  def isCallback(third: js.Object): /* is aws-lambda.aws-lambda/handler.Callback<any> */ Boolean = js.native
  
  def isContext(second: js.Object): /* is aws-lambda.aws-lambda/handler.Context */ Boolean = js.native
}
