package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weiboOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WeiboOutlined", JSImport.Default)
  @js.native
  val default: WeiboOutlinedIconType = js.native
  
  @js.native
  trait WeiboOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WeiboOutlinedIconType: String = js.native
  }
  
  type _To = WeiboOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `weiboOutlinedMod.foo` */
  override def _to: WeiboOutlinedIconType = default
}
