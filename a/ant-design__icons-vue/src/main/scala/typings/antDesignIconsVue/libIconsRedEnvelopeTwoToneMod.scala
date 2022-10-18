package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRedEnvelopeTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedEnvelopeTwoTone", JSImport.Default)
  @js.native
  val default: RedEnvelopeTwoToneIconType = js.native
  
  @js.native
  trait RedEnvelopeTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedEnvelopeTwoToneIconType: String = js.native
  }
  
  type _To = RedEnvelopeTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRedEnvelopeTwoToneMod.foo` */
  override def _to: RedEnvelopeTwoToneIconType = default
}
