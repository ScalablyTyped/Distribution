package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsContactsOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContactsOutlined", JSImport.Default)
  @js.native
  val default: ContactsOutlinedIconType = js.native
  
  @js.native
  trait ContactsOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ContactsOutlinedIconType: String = js.native
  }
  
  type _To = ContactsOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsContactsOutlinedMod.foo` */
  override def _to: ContactsOutlinedIconType = default
}
