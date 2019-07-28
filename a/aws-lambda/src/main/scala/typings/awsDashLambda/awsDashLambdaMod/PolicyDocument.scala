package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[String] = js.undefined
  var Statement: js.Array[typings.awsDashLambda.awsDashLambdaMod.Statement]
  var Version: String
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: js.Array[Statement], Version: String, Id: String = null): PolicyDocument = {
    val __obj = js.Dynamic.literal(Statement = Statement, Version = Version)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[PolicyDocument]
  }
}

