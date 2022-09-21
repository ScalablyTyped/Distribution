package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GlobalOutlined", JSImport.Default)
  @js.native
  val default: GlobalOutlinedIconType = js.native
  
  @js.native
  trait GlobalOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GlobalOutlinedIconType: String = js.native
  }
  
  type _To = GlobalOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `globalOutlinedMod.foo` */
  override def _to: GlobalOutlinedIconType = default
}
