package typings.antd.esMod

import typings.antd.Anon_ArgsChildren
import typings.antd.Anon_Colon
import typings.antd.TypeofClassFormItem
import typings.antd.esFormFormMod.FormComponentProps
import typings.antd.esFormFormMod.FormCreateOption
import typings.antd.esFormFormMod.FormProps
import typings.antd.esFormInterfaceMod.FormWrappedProps
import typings.antd.esFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Form")
@js.native
class Form protected () extends default {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd/es", "Form")
@js.native
object Form extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Anon_Colon = js.native
  var propTypes: Anon_ArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

