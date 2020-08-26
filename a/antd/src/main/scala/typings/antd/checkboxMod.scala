package typings.antd

import typings.antd.anon.Indeterminate
import typings.antd.anon.TypeofCheckboxGroup
import typings.antd.checkboxGroupMod.CheckboxGroupContext
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/checkbox", JSImport.Namespace)
@js.native
object checkboxMod extends js.Object {
  @js.native
  class default ()
    extends typings.antd.checkboxCheckboxMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: TypeofCheckboxGroup = js.native
    var __ANT_CHECKBOX: Boolean = js.native
    var contextType: Context[CheckboxGroupContext | Null] = js.native
    var defaultProps: Indeterminate = js.native
  }
  
}

