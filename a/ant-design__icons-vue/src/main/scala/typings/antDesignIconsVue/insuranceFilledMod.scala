package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insuranceFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsuranceFilled", JSImport.Default)
  @js.native
  val default: InsuranceFilledIconType = js.native
  
  @js.native
  trait InsuranceFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InsuranceFilledIconType: String = js.native
  }
  
  type _To = InsuranceFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `insuranceFilledMod.foo` */
  override def _to: InsuranceFilledIconType = default
}
