package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexResult extends js.Object {
  var dialogAction: LexDialogAction
  var sessionAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
}

object LexResult {
  @scala.inline
  def apply(dialogAction: LexDialogAction, sessionAttributes: StringDictionary[String] = null): LexResult = {
    val __obj = js.Dynamic.literal(dialogAction = dialogAction)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    __obj.asInstanceOf[LexResult]
  }
}

