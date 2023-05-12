package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSmileTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SmileTwoTone", JSImport.Default)
  @js.native
  val default: SmileTwoToneIconType = js.native
  
  @js.native
  trait SmileTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SmileTwoToneIconType: String = js.native
  }
  
  type _To = SmileTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSmileTwoToneMod.foo` */
  override def _to: SmileTwoToneIconType = default
}
