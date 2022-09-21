package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switcherOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SwitcherOutlined", JSImport.Default)
  @js.native
  val default: SwitcherOutlinedIconType = js.native
  
  @js.native
  trait SwitcherOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SwitcherOutlinedIconType: String = js.native
  }
  
  type _To = SwitcherOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `switcherOutlinedMod.foo` */
  override def _to: SwitcherOutlinedIconType = default
}
