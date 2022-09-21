package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compassTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CompassTwoTone", JSImport.Default)
  @js.native
  val default: CompassTwoToneIconType = js.native
  
  @js.native
  trait CompassTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CompassTwoToneIconType: String = js.native
  }
  
  type _To = CompassTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `compassTwoToneMod.foo` */
  override def _to: CompassTwoToneIconType = default
}
