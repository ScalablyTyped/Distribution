package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPicCenterOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PicCenterOutlined", JSImport.Default)
  @js.native
  val default: PicCenterOutlinedIconType = js.native
  
  @js.native
  trait PicCenterOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PicCenterOutlinedIconType: String = js.native
  }
  
  type _To = PicCenterOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPicCenterOutlinedMod.foo` */
  override def _to: PicCenterOutlinedIconType = default
}
