package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weiboCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WeiboCircleOutlined", JSImport.Default)
  @js.native
  val default: WeiboCircleOutlinedIconType = js.native
  
  @js.native
  trait WeiboCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WeiboCircleOutlinedIconType: String = js.native
  }
  
  type _To = WeiboCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `weiboCircleOutlinedMod.foo` */
  override def _to: WeiboCircleOutlinedIconType = default
}
