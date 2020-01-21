package typings.antd.mod

import typings.antd.AnonArgsChildren
import typings.antd.AnonColon
import typings.antd.TypeofClassFormItem
import typings.antd.formFormMod.FormComponentProps
import typings.antd.formFormMod.FormCreateOption
import typings.antd.formFormMod.FormProps
import typings.antd.formInterfaceMod.FormWrappedProps
import typings.antd.formMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Form")
@js.native
class Form protected () extends default {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd", "Form")
@js.native
object Form extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: AnonColon = js.native
  var propTypes: AnonArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

