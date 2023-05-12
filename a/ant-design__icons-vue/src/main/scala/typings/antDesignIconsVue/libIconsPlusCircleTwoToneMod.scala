package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlusCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusCircleTwoTone", JSImport.Default)
  @js.native
  val default: PlusCircleTwoToneIconType = js.native
  
  @js.native
  trait PlusCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PlusCircleTwoToneIconType: String = js.native
  }
  
  type _To = PlusCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlusCircleTwoToneMod.foo` */
  override def _to: PlusCircleTwoToneIconType = default
}
