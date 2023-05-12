package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPicLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PicLeftOutlined", JSImport.Default)
  @js.native
  val default: PicLeftOutlinedIconType = js.native
  
  @js.native
  trait PicLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PicLeftOutlinedIconType: String = js.native
  }
  
  type _To = PicLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPicLeftOutlinedMod.foo` */
  override def _to: PicLeftOutlinedIconType = default
}
