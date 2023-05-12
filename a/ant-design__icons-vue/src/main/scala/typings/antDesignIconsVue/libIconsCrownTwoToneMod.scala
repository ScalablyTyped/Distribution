package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCrownTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CrownTwoTone", JSImport.Default)
  @js.native
  val default: CrownTwoToneIconType = js.native
  
  @js.native
  trait CrownTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CrownTwoToneIconType: String = js.native
  }
  
  type _To = CrownTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCrownTwoToneMod.foo` */
  override def _to: CrownTwoToneIconType = default
}
