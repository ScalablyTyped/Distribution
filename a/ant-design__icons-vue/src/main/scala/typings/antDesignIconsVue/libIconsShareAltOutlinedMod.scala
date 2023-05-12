package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsShareAltOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ShareAltOutlined", JSImport.Default)
  @js.native
  val default: ShareAltOutlinedIconType = js.native
  
  @js.native
  trait ShareAltOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ShareAltOutlinedIconType: String = js.native
  }
  
  type _To = ShareAltOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsShareAltOutlinedMod.foo` */
  override def _to: ShareAltOutlinedIconType = default
}
