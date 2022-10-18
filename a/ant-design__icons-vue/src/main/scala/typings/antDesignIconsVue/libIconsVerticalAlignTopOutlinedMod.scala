package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVerticalAlignTopOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerticalAlignTopOutlined", JSImport.Default)
  @js.native
  val default: VerticalAlignTopOutlinedIconType = js.native
  
  @js.native
  trait VerticalAlignTopOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerticalAlignTopOutlinedIconType: String = js.native
  }
  
  type _To = VerticalAlignTopOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVerticalAlignTopOutlinedMod.foo` */
  override def _to: VerticalAlignTopOutlinedIconType = default
}
