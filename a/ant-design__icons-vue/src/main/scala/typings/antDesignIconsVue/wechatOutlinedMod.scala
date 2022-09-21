package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wechatOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WechatOutlined", JSImport.Default)
  @js.native
  val default: WechatOutlinedIconType = js.native
  
  @js.native
  trait WechatOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WechatOutlinedIconType: String = js.native
  }
  
  type _To = WechatOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `wechatOutlinedMod.foo` */
  override def _to: WechatOutlinedIconType = default
}
