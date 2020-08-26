package typings.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.Delegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexDialogActionDelegate extends LexDialogAction {
  var slots: StringDictionary[String | Null] = js.native
  var `type`: Delegate = js.native
}

object LexDialogActionDelegate {
  @scala.inline
  def apply(slots: StringDictionary[String | Null], `type`: Delegate): LexDialogActionDelegate = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionDelegate]
  }
  @scala.inline
  implicit class LexDialogActionDelegateOps[Self <: LexDialogActionDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSlots(value: StringDictionary[String | Null]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Delegate): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

