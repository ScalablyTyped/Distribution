package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsInsuranceOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsuranceOutlined", JSImport.Default)
  @js.native
  val default: InsuranceOutlinedIconType = js.native
  
  @js.native
  trait InsuranceOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_InsuranceOutlinedIconType: String = js.native
  }
  
  type _To = InsuranceOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsInsuranceOutlinedMod.foo` */
  override def _to: InsuranceOutlinedIconType = default
}
