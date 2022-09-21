package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object medicineBoxFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MedicineBoxFilled", JSImport.Default)
  @js.native
  val default: MedicineBoxFilledIconType = js.native
  
  @js.native
  trait MedicineBoxFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MedicineBoxFilledIconType: String = js.native
  }
  
  type _To = MedicineBoxFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `medicineBoxFilledMod.foo` */
  override def _to: MedicineBoxFilledIconType = default
}
