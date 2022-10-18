package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsArrowsAltOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowsAltOutlined", JSImport.Default)
  @js.native
  val default: ArrowsAltOutlinedIconType = js.native
  
  @js.native
  trait ArrowsAltOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ArrowsAltOutlinedIconType: String = js.native
  }
  
  type _To = ArrowsAltOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsArrowsAltOutlinedMod.foo` */
  override def _to: ArrowsAltOutlinedIconType = default
}
