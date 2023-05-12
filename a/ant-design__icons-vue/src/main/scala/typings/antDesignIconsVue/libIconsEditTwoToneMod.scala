package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEditTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EditTwoTone", JSImport.Default)
  @js.native
  val default: EditTwoToneIconType = js.native
  
  @js.native
  trait EditTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EditTwoToneIconType: String = js.native
  }
  
  type _To = EditTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEditTwoToneMod.foo` */
  override def _to: EditTwoToneIconType = default
}
