package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leftCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftCircleTwoTone", JSImport.Default)
  @js.native
  val default: LeftCircleTwoToneIconType = js.native
  
  @js.native
  trait LeftCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftCircleTwoToneIconType: String = js.native
  }
  
  type _To = LeftCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `leftCircleTwoToneMod.foo` */
  override def _to: LeftCircleTwoToneIconType = default
}
