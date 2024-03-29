package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHomeTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HomeTwoTone", JSImport.Default)
  @js.native
  val default: HomeTwoToneIconType = js.native
  
  @js.native
  trait HomeTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HomeTwoToneIconType: String = js.native
  }
  
  type _To = HomeTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHomeTwoToneMod.foo` */
  override def _to: HomeTwoToneIconType = default
}
