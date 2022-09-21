package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperClipOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PaperClipOutlined", JSImport.Default)
  @js.native
  val default: PaperClipOutlinedIconType = js.native
  
  @js.native
  trait PaperClipOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PaperClipOutlinedIconType: String = js.native
  }
  
  type _To = PaperClipOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `paperClipOutlinedMod.foo` */
  override def _to: PaperClipOutlinedIconType = default
}
