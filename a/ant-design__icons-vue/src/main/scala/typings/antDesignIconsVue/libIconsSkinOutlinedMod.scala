package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSkinOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkinOutlined", JSImport.Default)
  @js.native
  val default: SkinOutlinedIconType = js.native
  
  @js.native
  trait SkinOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SkinOutlinedIconType: String = js.native
  }
  
  type _To = SkinOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSkinOutlinedMod.foo` */
  override def _to: SkinOutlinedIconType = default
}
