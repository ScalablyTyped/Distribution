package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCheckSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckSquareTwoTone", JSImport.Default)
  @js.native
  val default: CheckSquareTwoToneIconType = js.native
  
  @js.native
  trait CheckSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CheckSquareTwoToneIconType: String = js.native
  }
  
  type _To = CheckSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCheckSquareTwoToneMod.foo` */
  override def _to: CheckSquareTwoToneIconType = default
}
