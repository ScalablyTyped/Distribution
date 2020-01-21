package typings.antd

import typings.antd.formFormMod.FormComponentProps
import typings.antd.formFormMod.FormCreateOption
import typings.antd.formFormMod.FormProps
import typings.antd.formInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.formFormMod.default {
    def this(props: FormProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: TypeofClassFormItem = js.native
    var createFormField: js.Any = js.native
    var defaultProps: AnonColon = js.native
    var propTypes: AnonArgsChildren = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
}

