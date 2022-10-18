package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDeleteTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeleteTwoTone", JSImport.Default)
  @js.native
  val default: DeleteTwoToneIconType = js.native
  
  @js.native
  trait DeleteTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DeleteTwoToneIconType: String = js.native
  }
  
  type _To = DeleteTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDeleteTwoToneMod.foo` */
  override def _to: DeleteTwoToneIconType = default
}
