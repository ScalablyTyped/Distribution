package typings.awsLambda.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.Delegate
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
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionDelegate]
  }
}

