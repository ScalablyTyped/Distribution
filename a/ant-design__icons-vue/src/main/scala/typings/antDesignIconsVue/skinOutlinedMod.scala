package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skinOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkinOutlined", JSImport.Default)
  @js.native
  val default: SkinOutlinedIconType = js.native
  
  @js.native
  trait SkinOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SkinOutlinedIconType: String = js.native
  }
  
  type _To = SkinOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `skinOutlinedMod.foo` */
  override def _to: SkinOutlinedIconType = default
}
