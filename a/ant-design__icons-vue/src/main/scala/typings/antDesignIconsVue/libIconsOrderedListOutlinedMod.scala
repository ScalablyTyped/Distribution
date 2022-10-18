package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsOrderedListOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/OrderedListOutlined", JSImport.Default)
  @js.native
  val default: OrderedListOutlinedIconType = js.native
  
  @js.native
  trait OrderedListOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_OrderedListOutlinedIconType: String = js.native
  }
  
  type _To = OrderedListOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsOrderedListOutlinedMod.foo` */
  override def _to: OrderedListOutlinedIconType = default
}
