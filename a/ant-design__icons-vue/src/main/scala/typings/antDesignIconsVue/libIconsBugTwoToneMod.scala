package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBugTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BugTwoTone", JSImport.Default)
  @js.native
  val default: BugTwoToneIconType = js.native
  
  @js.native
  trait BugTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BugTwoToneIconType: String = js.native
  }
  
  type _To = BugTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBugTwoToneMod.foo` */
  override def _to: BugTwoToneIconType = default
}
