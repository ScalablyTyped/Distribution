package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMedicineBoxOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MedicineBoxOutlined", JSImport.Default)
  @js.native
  val default: MedicineBoxOutlinedIconType = js.native
  
  @js.native
  trait MedicineBoxOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MedicineBoxOutlinedIconType: String = js.native
  }
  
  type _To = MedicineBoxOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMedicineBoxOutlinedMod.foo` */
  override def _to: MedicineBoxOutlinedIconType = default
}
