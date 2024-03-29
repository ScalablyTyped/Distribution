package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMinusCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MinusCircleTwoTone", JSImport.Default)
  @js.native
  val default: MinusCircleTwoToneIconType = js.native
  
  @js.native
  trait MinusCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MinusCircleTwoToneIconType: String = js.native
  }
  
  type _To = MinusCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMinusCircleTwoToneMod.foo` */
  override def _to: MinusCircleTwoToneIconType = default
}
