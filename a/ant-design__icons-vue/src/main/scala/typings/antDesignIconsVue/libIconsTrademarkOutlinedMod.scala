package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsTrademarkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrademarkOutlined", JSImport.Default)
  @js.native
  val default: TrademarkOutlinedIconType = js.native
  
  @js.native
  trait TrademarkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_TrademarkOutlinedIconType: String = js.native
  }
  
  type _To = TrademarkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsTrademarkOutlinedMod.foo` */
  override def _to: TrademarkOutlinedIconType = default
}
