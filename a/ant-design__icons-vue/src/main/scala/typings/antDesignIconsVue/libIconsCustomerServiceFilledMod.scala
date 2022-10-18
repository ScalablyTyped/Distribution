package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCustomerServiceFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CustomerServiceFilled", JSImport.Default)
  @js.native
  val default: CustomerServiceFilledIconType = js.native
  
  @js.native
  trait CustomerServiceFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CustomerServiceFilledIconType: String = js.native
  }
  
  type _To = CustomerServiceFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCustomerServiceFilledMod.foo` */
  override def _to: CustomerServiceFilledIconType = default
}
