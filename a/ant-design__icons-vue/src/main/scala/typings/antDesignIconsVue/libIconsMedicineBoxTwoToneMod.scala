package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMedicineBoxTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MedicineBoxTwoTone", JSImport.Default)
  @js.native
  val default: MedicineBoxTwoToneIconType = js.native
  
  @js.native
  trait MedicineBoxTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MedicineBoxTwoToneIconType: String = js.native
  }
  
  type _To = MedicineBoxTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMedicineBoxTwoToneMod.foo` */
  override def _to: MedicineBoxTwoToneIconType = default
}
