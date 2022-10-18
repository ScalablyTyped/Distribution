package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlignLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlignLeftOutlined", JSImport.Default)
  @js.native
  val default: AlignLeftOutlinedIconType = js.native
  
  @js.native
  trait AlignLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AlignLeftOutlinedIconType: String = js.native
  }
  
  type _To = AlignLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlignLeftOutlinedMod.foo` */
  override def _to: AlignLeftOutlinedIconType = default
}
