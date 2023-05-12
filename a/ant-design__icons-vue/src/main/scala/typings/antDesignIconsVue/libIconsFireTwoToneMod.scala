package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFireTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FireTwoTone", JSImport.Default)
  @js.native
  val default: FireTwoToneIconType = js.native
  
  @js.native
  trait FireTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FireTwoToneIconType: String = js.native
  }
  
  type _To = FireTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFireTwoToneMod.foo` */
  override def _to: FireTwoToneIconType = default
}
