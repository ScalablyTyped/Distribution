package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form/Form", JSImport.Default)
@js.native
class default protected () extends Form {
  def this(props: FormProps) = this()
}

@JSImport("antd/lib/form/Form", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: ScalablyTyped.runtime.Instantiable0[antdLib.libFormFormItemMod.default] = js.native
  var childContextTypes: antdLib.Anon_Vertical = js.native
  var createFormField: js.Any = js.native
  var defaultProps: antdLib.Anon_OnSubmit = js.native
  var propTypes: antdLib.Anon_ChildrenPrefixCls = js.native
  def create[TOwnProps](): antdLib.libFormFormMod.ComponentDecorator = js.native
  def create[TOwnProps](options: antdLib.libFormFormMod.FormCreateOption[TOwnProps]): antdLib.libFormFormMod.ComponentDecorator = js.native
}

