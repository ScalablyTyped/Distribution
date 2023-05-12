package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDollarCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DollarCircleTwoTone", JSImport.Default)
  @js.native
  val default: DollarCircleTwoToneIconType = js.native
  
  @js.native
  trait DollarCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DollarCircleTwoToneIconType: String = js.native
  }
  
  type _To = DollarCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDollarCircleTwoToneMod.foo` */
  override def _to: DollarCircleTwoToneIconType = default
}
