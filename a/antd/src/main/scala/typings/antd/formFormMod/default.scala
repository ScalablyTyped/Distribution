package typings.antd.formFormMod

import typings.antd.AnonArgsChildren
import typings.antd.AnonColon
import typings.antd.TypeofClassFormItem
import typings.antd.formInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form/Form", JSImport.Default)
@js.native
class default protected () extends Form {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd/lib/form/Form", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: AnonColon = js.native
  var propTypes: AnonArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

