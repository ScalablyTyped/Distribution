package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.passwordMod.PasswordProps
import typings.antd.searchMod.SearchProps
import typings.antd.textAreaMod.TextAreaProps
import typings.antd.textAreaMod.TextAreaRef
import typings.rcInput.interfaceMod.InputRef
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod extends Shortcut {
  
  @JSImport("antd/lib/input", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] {
    
    var Group: FC[GroupProps] = js.native
    
    var Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = js.native
    
    var Search: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = js.native
    
    var TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `inputMod.foo` */
  override def _to: CompoundedComponent = default
}
