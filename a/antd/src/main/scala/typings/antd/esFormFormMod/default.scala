package typings.antd.esFormFormMod

import typings.antd.Anon_ArgsChildren
import typings.antd.Anon_Colon
import typings.antd.TypeofClassFormItem
import typings.antd.esFormInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es/form/Form", JSImport.Default)
@js.native
class default protected () extends Form {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd/es/form/Form", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Anon_Colon = js.native
  var propTypes: Anon_ArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

