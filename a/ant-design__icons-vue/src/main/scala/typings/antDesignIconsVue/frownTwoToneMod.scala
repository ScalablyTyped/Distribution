package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frownTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FrownTwoTone", JSImport.Default)
  @js.native
  val default: FrownTwoToneIconType = js.native
  
  @js.native
  trait FrownTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FrownTwoToneIconType: String = js.native
  }
  
  type _To = FrownTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `frownTwoToneMod.foo` */
  override def _to: FrownTwoToneIconType = default
}
