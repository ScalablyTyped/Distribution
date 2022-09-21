package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upSquareTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpSquareTwoTone", JSImport.Default)
  @js.native
  val default: UpSquareTwoToneIconType = js.native
  
  @js.native
  trait UpSquareTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpSquareTwoToneIconType: String = js.native
  }
  
  type _To = UpSquareTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `upSquareTwoToneMod.foo` */
  override def _to: UpSquareTwoToneIconType = default
}
