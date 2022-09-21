package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contactsFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContactsFilled", JSImport.Default)
  @js.native
  val default: ContactsFilledIconType = js.native
  
  @js.native
  trait ContactsFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ContactsFilledIconType: String = js.native
  }
  
  type _To = ContactsFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `contactsFilledMod.foo` */
  override def _to: ContactsFilledIconType = default
}
