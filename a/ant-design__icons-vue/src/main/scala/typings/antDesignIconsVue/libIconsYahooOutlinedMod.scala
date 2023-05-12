package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYahooOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YahooOutlined", JSImport.Default)
  @js.native
  val default: YahooOutlinedIconType = js.native
  
  @js.native
  trait YahooOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_YahooOutlinedIconType: String = js.native
  }
  
  type _To = YahooOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYahooOutlinedMod.foo` */
  override def _to: YahooOutlinedIconType = default
}
