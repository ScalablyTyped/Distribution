package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LayoutTwoTone", JSImport.Default)
  @js.native
  val default: LayoutTwoToneIconType = js.native
  
  @js.native
  trait LayoutTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LayoutTwoToneIconType: String = js.native
  }
  
  type _To = LayoutTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `layoutTwoToneMod.foo` */
  override def _to: LayoutTwoToneIconType = default
}
