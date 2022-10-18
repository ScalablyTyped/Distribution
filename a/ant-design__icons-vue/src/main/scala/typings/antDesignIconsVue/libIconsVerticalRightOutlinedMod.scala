package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsVerticalRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerticalRightOutlined", JSImport.Default)
  @js.native
  val default: VerticalRightOutlinedIconType = js.native
  
  @js.native
  trait VerticalRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerticalRightOutlinedIconType: String = js.native
  }
  
  type _To = VerticalRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsVerticalRightOutlinedMod.foo` */
  override def _to: VerticalRightOutlinedIconType = default
}
