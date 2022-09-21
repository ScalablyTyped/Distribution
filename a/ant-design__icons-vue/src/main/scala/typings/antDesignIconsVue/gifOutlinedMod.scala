package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gifOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GifOutlined", JSImport.Default)
  @js.native
  val default: GifOutlinedIconType = js.native
  
  @js.native
  trait GifOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GifOutlinedIconType: String = js.native
  }
  
  type _To = GifOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `gifOutlinedMod.foo` */
  override def _to: GifOutlinedIconType = default
}
