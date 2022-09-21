package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coffeeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CoffeeOutlined", JSImport.Default)
  @js.native
  val default: CoffeeOutlinedIconType = js.native
  
  @js.native
  trait CoffeeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CoffeeOutlinedIconType: String = js.native
  }
  
  type _To = CoffeeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `coffeeOutlinedMod.foo` */
  override def _to: CoffeeOutlinedIconType = default
}
