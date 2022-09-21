package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpCircleTwoTone", JSImport.Default)
  @js.native
  val default: UpCircleTwoToneIconType = js.native
  
  @js.native
  trait UpCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpCircleTwoToneIconType: String = js.native
  }
  
  type _To = UpCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `upCircleTwoToneMod.foo` */
  override def _to: UpCircleTwoToneIconType = default
}
