package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelButtonDisabled extends js.Object {
  var cancelButtonDisabled: scala.Boolean
  var confirmLoading: scala.Boolean
  var maskTransitionName: java.lang.String
  var okButtonDisabled: scala.Boolean
  var okType: antdLib.antdLibStrings.link | antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger
  var transitionName: java.lang.String
  var visible: scala.Boolean
  var width: scala.Double
}

object Anon_CancelButtonDisabled {
  @scala.inline
  def apply(
    cancelButtonDisabled: scala.Boolean,
    confirmLoading: scala.Boolean,
    maskTransitionName: java.lang.String,
    okButtonDisabled: scala.Boolean,
    okType: antdLib.antdLibStrings.link | antdLib.antdLibStrings.default | antdLib.antdLibStrings.dashed | antdLib.antdLibStrings.primary | antdLib.antdLibStrings.ghost | antdLib.antdLibStrings.danger,
    transitionName: java.lang.String,
    visible: scala.Boolean,
    width: scala.Double
  ): Anon_CancelButtonDisabled = {
    val __obj = js.Dynamic.literal(cancelButtonDisabled = cancelButtonDisabled, confirmLoading = confirmLoading, maskTransitionName = maskTransitionName, okButtonDisabled = okButtonDisabled, okType = okType.asInstanceOf[js.Any], transitionName = transitionName, visible = visible, width = width)
  
    __obj.asInstanceOf[Anon_CancelButtonDisabled]
  }
}

