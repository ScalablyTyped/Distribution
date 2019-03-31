package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonType extends js.Object {
  var buttonType: java.lang.String
  var prefixCls: java.lang.String
  def onButtonClick(): scala.Unit
}

object Anon_ButtonType {
  @scala.inline
  def apply(buttonType: java.lang.String, onButtonClick: () => scala.Unit, prefixCls: java.lang.String): Anon_ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType, onButtonClick = js.Any.fromFunction0(onButtonClick), prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_ButtonType]
  }
}

