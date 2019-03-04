package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: java.lang.String
  var inputPrefixCls: java.lang.String
  var prefixCls: java.lang.String
  var visibilityToggle: scala.Boolean
}

object Anon_Action {
  @scala.inline
  def apply(
    action: java.lang.String,
    inputPrefixCls: java.lang.String,
    prefixCls: java.lang.String,
    visibilityToggle: scala.Boolean
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, inputPrefixCls = inputPrefixCls, prefixCls = prefixCls, visibilityToggle = visibilityToggle)
  
    __obj.asInstanceOf[Anon_Action]
  }
}

