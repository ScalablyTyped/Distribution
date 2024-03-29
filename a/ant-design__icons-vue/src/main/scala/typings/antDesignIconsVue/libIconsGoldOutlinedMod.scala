package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGoldOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GoldOutlined", JSImport.Default)
  @js.native
  val default: GoldOutlinedIconType = js.native
  
  @js.native
  trait GoldOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GoldOutlinedIconType: String = js.native
  }
  
  type _To = GoldOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGoldOutlinedMod.foo` */
  override def _to: GoldOutlinedIconType = default
}
