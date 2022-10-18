package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyTwoTone", JSImport.Default)
  @js.native
  val default: CopyTwoToneIconType = js.native
  
  @js.native
  trait CopyTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CopyTwoToneIconType: String = js.native
  }
  
  type _To = CopyTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyTwoToneMod.foo` */
  override def _to: CopyTwoToneIconType = default
}
