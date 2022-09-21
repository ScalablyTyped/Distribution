package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weiboSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WeiboSquareOutlined", JSImport.Default)
  @js.native
  val default: WeiboSquareOutlinedIconType = js.native
  
  @js.native
  trait WeiboSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WeiboSquareOutlinedIconType: String = js.native
  }
  
  type _To = WeiboSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `weiboSquareOutlinedMod.foo` */
  override def _to: WeiboSquareOutlinedIconType = default
}
