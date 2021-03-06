package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Children
import typings.antd.anon.FnCall
import typings.antd.anon.FnCallProps
import typings.antd.errorListMod.ErrorListProps
import typings.antd.formContextMod.FormProviderProps
import typings.antd.formFormMod.FormProps
import typings.antd.formListMod.FormListProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod extends Shortcut {
  
  @JSImport("antd/lib/form", JSImport.Default)
  @js.native
  val default: FormInterface = js.native
  
  @js.native
  trait FormInterface extends InternalFormType {
    
    var ErrorList: js.Function1[/* hasErrorsHelpOnDomErrorVisibleChange */ ErrorListProps, Element] = js.native
    
    var Item: FnCallProps = js.native
    
    var List: FC[FormListProps] = js.native
    
    var Provider: FC[FormProviderProps] = js.native
    
    /** @deprecated Only for warning usage. Do not use. */
    def create(): Unit = js.native
    
    var useForm: FnCall = js.native
  }
  
  @js.native
  trait InternalFormType extends StObject {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
  
  type _To = FormInterface
  
  /* This means you don't have to write `default`, but can instead just say `formMod.foo` */
  override def _to: FormInterface = default
}
