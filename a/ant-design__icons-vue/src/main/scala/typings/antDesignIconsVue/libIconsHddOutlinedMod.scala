package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HddOutlined", JSImport.Default)
  @js.native
  val default: HddOutlinedIconType = js.native
  
  @js.native
  trait HddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HddOutlinedIconType: String = js.native
  }
  
  type _To = HddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHddOutlinedMod.foo` */
  override def _to: HddOutlinedIconType = default
}
