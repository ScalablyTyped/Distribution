package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionName extends js.Object {
  var FunctionName: java.lang.String
  var UserParameters: java.lang.String
}

object Anon_FunctionName {
  @scala.inline
  def apply(FunctionName: java.lang.String, UserParameters: java.lang.String): Anon_FunctionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FunctionName")(FunctionName)
    __obj.updateDynamic("UserParameters")(UserParameters)
    __obj.asInstanceOf[Anon_FunctionName]
  }
}

