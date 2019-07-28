package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.awsDashLambdaStrings.Delegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionDelegate extends LexDialogAction {
  var slots: StringDictionary[String | Null]
  var `type`: Delegate
}

object LexDialogActionDelegate {
  @scala.inline
  def apply(slots: StringDictionary[String | Null], `type`: Delegate): LexDialogActionDelegate = {
    val __obj = js.Dynamic.literal(slots = slots)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LexDialogActionDelegate]
  }
}

