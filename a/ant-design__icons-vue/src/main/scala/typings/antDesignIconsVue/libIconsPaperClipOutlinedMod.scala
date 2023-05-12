package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPaperClipOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PaperClipOutlined", JSImport.Default)
  @js.native
  val default: PaperClipOutlinedIconType = js.native
  
  @js.native
  trait PaperClipOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PaperClipOutlinedIconType: String = js.native
  }
  
  type _To = PaperClipOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPaperClipOutlinedMod.foo` */
  override def _to: PaperClipOutlinedIconType = default
}
