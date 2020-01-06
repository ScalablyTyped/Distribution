package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueHolder extends js.Object {
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure.
    */
  var IonText: js.UndefOr[typings.awsDashSdk.clientsQldbMod.IonText] = js.native
}

object ValueHolder {
  @scala.inline
  def apply(IonText: IonText = null): ValueHolder = {
    val __obj = js.Dynamic.literal()
    if (IonText != null) __obj.updateDynamic("IonText")(IonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueHolder]
  }
}

