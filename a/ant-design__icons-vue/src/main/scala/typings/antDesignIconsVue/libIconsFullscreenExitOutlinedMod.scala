package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFullscreenExitOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FullscreenExitOutlined", JSImport.Default)
  @js.native
  val default: FullscreenExitOutlinedIconType = js.native
  
  @js.native
  trait FullscreenExitOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FullscreenExitOutlinedIconType: String = js.native
  }
  
  type _To = FullscreenExitOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFullscreenExitOutlinedMod.foo` */
  override def _to: FullscreenExitOutlinedIconType = default
}
