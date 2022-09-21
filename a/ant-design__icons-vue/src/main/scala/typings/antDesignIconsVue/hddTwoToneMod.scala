package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hddTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HddTwoTone", JSImport.Default)
  @js.native
  val default: HddTwoToneIconType = js.native
  
  @js.native
  trait HddTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HddTwoToneIconType: String = js.native
  }
  
  type _To = HddTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `hddTwoToneMod.foo` */
  override def _to: HddTwoToneIconType = default
}
