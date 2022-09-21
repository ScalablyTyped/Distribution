package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DiffTwoTone", JSImport.Default)
  @js.native
  val default: DiffTwoToneIconType = js.native
  
  @js.native
  trait DiffTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DiffTwoToneIconType: String = js.native
  }
  
  type _To = DiffTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `diffTwoToneMod.foo` */
  override def _to: DiffTwoToneIconType = default
}
