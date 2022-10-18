package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAppstoreTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AppstoreTwoTone", JSImport.Default)
  @js.native
  val default: AppstoreTwoToneIconType = js.native
  
  @js.native
  trait AppstoreTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AppstoreTwoToneIconType: String = js.native
  }
  
  type _To = AppstoreTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAppstoreTwoToneMod.foo` */
  override def _to: AppstoreTwoToneIconType = default
}
