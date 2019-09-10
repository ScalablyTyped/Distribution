package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueHolder extends js.Object {
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typings.awsDashSdk.clientsQldbMod.IonText] = js.undefined
}

object ValueHolder {
  @scala.inline
  def apply(IonText: IonText = null): ValueHolder = {
    val __obj = js.Dynamic.literal()
    if (IonText != null) __obj.updateDynamic("IonText")(IonText)
    __obj.asInstanceOf[ValueHolder]
  }
}

