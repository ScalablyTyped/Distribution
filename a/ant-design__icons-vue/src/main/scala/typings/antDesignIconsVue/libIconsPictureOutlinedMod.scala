package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPictureOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PictureOutlined", JSImport.Default)
  @js.native
  val default: PictureOutlinedIconType = js.native
  
  @js.native
  trait PictureOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PictureOutlinedIconType: String = js.native
  }
  
  type _To = PictureOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPictureOutlinedMod.foo` */
  override def _to: PictureOutlinedIconType = default
}
