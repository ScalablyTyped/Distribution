package typings.antd

import typings.antd.formContextMod.FormProviderProps
import typings.antd.formFormMod.FormProps
import typings.antd.formItemMod.FormItemProps
import typings.antd.formListMod.FormListProps
import typings.antd.formUtilMod.FormInstance
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  @js.native
  trait Form extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    var Item: js.Function1[/* props */ FormItemProps, ReactElement] = js.native
    var List: FC[FormListProps] = js.native
    var Provider: FC[FormProviderProps] = js.native
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
  }
  
  val default: Form = js.native
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}

