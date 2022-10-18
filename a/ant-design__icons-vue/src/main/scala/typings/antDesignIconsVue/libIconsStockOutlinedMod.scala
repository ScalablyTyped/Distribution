package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStockOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StockOutlined", JSImport.Default)
  @js.native
  val default: StockOutlinedIconType = js.native
  
  @js.native
  trait StockOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StockOutlinedIconType: String = js.native
  }
  
  type _To = StockOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStockOutlinedMod.foo` */
  override def _to: StockOutlinedIconType = default
}
