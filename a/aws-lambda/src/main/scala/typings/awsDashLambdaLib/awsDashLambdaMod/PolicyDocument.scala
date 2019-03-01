package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDocument extends js.Object {
  var Id: js.UndefOr[java.lang.String] = js.undefined
  var Statement: js.Array[Statement]
  var Version: java.lang.String
}

object PolicyDocument {
  @scala.inline
  def apply(Statement: js.Array[Statement], Version: java.lang.String, Id: java.lang.String = null): PolicyDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Statement")(Statement)
    __obj.updateDynamic("Version")(Version)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[PolicyDocument]
  }
}

