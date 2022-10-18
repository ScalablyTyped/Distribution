package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloudTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudTwoTone", JSImport.Default)
  @js.native
  val default: CloudTwoToneIconType = js.native
  
  @js.native
  trait CloudTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudTwoToneIconType: String = js.native
  }
  
  type _To = CloudTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloudTwoToneMod.foo` */
  override def _to: CloudTwoToneIconType = default
}
