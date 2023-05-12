package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPictureTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PictureTwoTone", JSImport.Default)
  @js.native
  val default: PictureTwoToneIconType = js.native
  
  @js.native
  trait PictureTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PictureTwoToneIconType: String = js.native
  }
  
  type _To = PictureTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPictureTwoToneMod.foo` */
  override def _to: PictureTwoToneIconType = default
}
