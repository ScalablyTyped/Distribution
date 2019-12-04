package typings.antd

import typings.antd.libFormFormMod.FormComponentProps
import typings.antd.libFormFormMod.FormCreateOption
import typings.antd.libFormFormMod.FormProps
import typings.antd.libFormInterfaceMod.FormWrappedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object libFormMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.antd.libFormFormMod.default {
    def this(props: FormProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Item: TypeofClassFormItem = js.native
    var createFormField: js.Any = js.native
    var defaultProps: Anon_Colon = js.native
    var propTypes: Anon_ArgsChildren = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
    def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
  }
  
}

