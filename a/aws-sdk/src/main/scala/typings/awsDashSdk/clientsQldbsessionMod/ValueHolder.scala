package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueHolder extends js.Object {
  /**
    * An Amazon Ion binary value contained in a ValueHolder structure. 
    */
  var IonBinary: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.IonBinary] = js.undefined
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure. 
    */
  var IonText: js.UndefOr[typings.awsDashSdk.clientsQldbsessionMod.IonText] = js.undefined
}

object ValueHolder {
  @scala.inline
  def apply(IonBinary: IonBinary = null, IonText: IonText = null): ValueHolder = {
    val __obj = js.Dynamic.literal()
    if (IonBinary != null) __obj.updateDynamic("IonBinary")(IonBinary.asInstanceOf[js.Any])
    if (IonText != null) __obj.updateDynamic("IonText")(IonText)
    __obj.asInstanceOf[ValueHolder]
  }
}

