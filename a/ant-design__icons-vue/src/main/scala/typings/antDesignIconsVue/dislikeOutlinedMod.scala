package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dislikeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DislikeOutlined", JSImport.Default)
  @js.native
  val default: DislikeOutlinedIconType = js.native
  
  @js.native
  trait DislikeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DislikeOutlinedIconType: String = js.native
  }
  
  type _To = DislikeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dislikeOutlinedMod.foo` */
  override def _to: DislikeOutlinedIconType = default
}
