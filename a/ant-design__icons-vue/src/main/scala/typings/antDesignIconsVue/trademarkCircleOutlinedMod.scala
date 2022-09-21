package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trademarkCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/TrademarkCircleOutlined", JSImport.Default)
  @js.native
  val default: TrademarkCircleOutlinedIconType = js.native
  
  @js.native
  trait TrademarkCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_TrademarkCircleOutlinedIconType: String = js.native
  }
  
  type _To = TrademarkCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `trademarkCircleOutlinedMod.foo` */
  override def _to: TrademarkCircleOutlinedIconType = default
}
