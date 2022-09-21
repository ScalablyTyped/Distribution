package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customerServiceTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CustomerServiceTwoTone", JSImport.Default)
  @js.native
  val default: CustomerServiceTwoToneIconType = js.native
  
  @js.native
  trait CustomerServiceTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CustomerServiceTwoToneIconType: String = js.native
  }
  
  type _To = CustomerServiceTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `customerServiceTwoToneMod.foo` */
  override def _to: CustomerServiceTwoToneIconType = default
}
