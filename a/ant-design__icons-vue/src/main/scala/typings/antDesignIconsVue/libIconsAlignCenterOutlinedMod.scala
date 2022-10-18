package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAlignCenterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AlignCenterOutlined", JSImport.Default)
  @js.native
  val default: AlignCenterOutlinedIconType = js.native
  
  @js.native
  trait AlignCenterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AlignCenterOutlinedIconType: String = js.native
  }
  
  type _To = AlignCenterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAlignCenterOutlinedMod.foo` */
  override def _to: AlignCenterOutlinedIconType = default
}
