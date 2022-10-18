package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsProfileTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ProfileTwoTone", JSImport.Default)
  @js.native
  val default: ProfileTwoToneIconType = js.native
  
  @js.native
  trait ProfileTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ProfileTwoToneIconType: String = js.native
  }
  
  type _To = ProfileTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsProfileTwoToneMod.foo` */
  override def _to: ProfileTwoToneIconType = default
}
