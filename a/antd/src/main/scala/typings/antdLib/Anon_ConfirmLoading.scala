package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfirmLoading extends js.Object {
  var confirmLoading: scala.Boolean
  var maskTransitionName: java.lang.String
  var okType: antdLib.antdLibStrings.link | antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger
  var transitionName: java.lang.String
  var visible: scala.Boolean
  var width: scala.Double
}

object Anon_ConfirmLoading {
  @scala.inline
  def apply(
    confirmLoading: scala.Boolean,
    maskTransitionName: java.lang.String,
    okType: antdLib.antdLibStrings.link | antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger,
    transitionName: java.lang.String,
    visible: scala.Boolean,
    width: scala.Double
  ): Anon_ConfirmLoading = {
    val __obj = js.Dynamic.literal(confirmLoading = confirmLoading, maskTransitionName = maskTransitionName, okType = okType.asInstanceOf[js.Any], transitionName = transitionName, visible = visible, width = width)
  
    __obj.asInstanceOf[Anon_ConfirmLoading]
  }
}

