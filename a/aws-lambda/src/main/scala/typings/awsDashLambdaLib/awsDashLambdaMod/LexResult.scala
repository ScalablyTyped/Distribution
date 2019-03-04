package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexResult extends js.Object {
  var dialogAction: LexDialogAction
  var sessionAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object LexResult {
  @scala.inline
  def apply(
    dialogAction: LexDialogAction,
    sessionAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): LexResult = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    __obj.asInstanceOf[LexResult]
  }
}

