package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMehTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MehTwoTone", JSImport.Default)
  @js.native
  val default: MehTwoToneIconType = js.native
  
  @js.native
  trait MehTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MehTwoToneIconType: String = js.native
  }
  
  type _To = MehTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMehTwoToneMod.foo` */
  override def _to: MehTwoToneIconType = default
}
