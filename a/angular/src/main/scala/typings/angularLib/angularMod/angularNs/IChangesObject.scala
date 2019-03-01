package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangesObject[T] extends js.Object {
  var currentValue: T
  var previousValue: T
  def isFirstChange(): scala.Boolean
}

object IChangesObject {
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: js.Function0[scala.Boolean], previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentValue")(currentValue.asInstanceOf[js.Any])
    __obj.updateDynamic("isFirstChange")(isFirstChange)
    __obj.updateDynamic("previousValue")(previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
}

