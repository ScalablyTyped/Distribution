package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsReloadOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ReloadOutlined", JSImport.Default)
  @js.native
  val default: ReloadOutlinedIconType = js.native
  
  @js.native
  trait ReloadOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ReloadOutlinedIconType: String = js.native
  }
  
  type _To = ReloadOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsReloadOutlinedMod.foo` */
  override def _to: ReloadOutlinedIconType = default
}
