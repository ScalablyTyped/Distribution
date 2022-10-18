package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libInputGroupMod.GroupProps
import typings.antd.libInputInputMod.InputProps
import typings.antd.libInputPasswordMod.PasswordProps
import typings.antd.libInputSearchMod.SearchProps
import typings.antd.libInputTextAreaMod.TextAreaProps
import typings.antd.libInputTextAreaMod.TextAreaRef
import typings.rcInput.esInterfaceMod.InputRef
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputMod extends Shortcut {
  
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
  
  /* This means you don't have to write `default`, but can instead just say `libInputMod.foo` */
  override def _to: CompoundedComponent = default
}
