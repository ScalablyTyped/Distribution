package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlignRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlignRightOutlined", JSImport.Default)
  @js.native
  val default: AlignRightOutlinedIconType = js.native
  
  @js.native
  trait AlignRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AlignRightOutlinedIconType: String = js.native
  }
  
  type _To = AlignRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlignRightOutlinedMod.foo` */
  override def _to: AlignRightOutlinedIconType = default
}
