package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDollarTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DollarTwoTone", JSImport.Default)
  @js.native
  val default: DollarTwoToneIconType = js.native
  
  @js.native
  trait DollarTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DollarTwoToneIconType: String = js.native
  }
  
  type _To = DollarTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDollarTwoToneMod.foo` */
  override def _to: DollarTwoToneIconType = default
}
