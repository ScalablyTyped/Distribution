package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insuranceTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InsuranceTwoTone", JSImport.Default)
  @js.native
  val default: InsuranceTwoToneIconType = js.native
  
  @js.native
  trait InsuranceTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InsuranceTwoToneIconType: String = js.native
  }
  
  type _To = InsuranceTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `insuranceTwoToneMod.foo` */
  override def _to: InsuranceTwoToneIconType = default
}
