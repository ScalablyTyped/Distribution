package typings.antd

import typings.antd.anon.PartialInputState
import typings.antd.inputGroupMod.GroupProps
import typings.antd.inputInputMod.InputProps
import typings.antd.inputInputMod.InputState
import typings.antd.passwordMod.PasswordProps
import typings.antd.searchMod.SearchProps
import typings.antd.textAreaMod.TextAreaProps
import typings.antd.textAreaMod.TextAreaRef
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("antd/lib/input", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.antd.inputInputMod.default {
    def this(props: InputProps) = this()
  }
  object default {
    
    @JSImport("antd/lib/input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof Group` */
    @JSImport("antd/lib/input", "default.Group")
    @js.native
    def Group: FC[GroupProps] = js.native
    @scala.inline
    def Group_=(x: FC[GroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Password` */
    @JSImport("antd/lib/input", "default.Password")
    @js.native
    def Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]] = js.native
    @scala.inline
    def Password_=(x: ForwardRefExoticComponent[PasswordProps with RefAttributes[_]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Password")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof Search` */
    @JSImport("antd/lib/input", "default.Search")
    @js.native
    def Search: ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]] = js.native
    @scala.inline
    def Search_=(x: ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Search")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof TextArea` */
    @JSImport("antd/lib/input", "default.TextArea")
    @js.native
    def TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]] = js.native
    @scala.inline
    def TextArea_=(x: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextArea")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd/lib/input", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
    
    /* static member */
    @JSImport("antd/lib/input", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: InputProps, hasPrevValue: InputState): PartialInputState = js.native
  }
}
