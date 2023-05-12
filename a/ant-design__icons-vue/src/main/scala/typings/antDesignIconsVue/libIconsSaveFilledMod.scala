package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSaveFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SaveFilled", JSImport.Default)
  @js.native
  val default: SaveFilledIconType = js.native
  
  @js.native
  trait SaveFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SaveFilledIconType: String = js.native
  }
  
  type _To = SaveFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSaveFilledMod.foo` */
  override def _to: SaveFilledIconType = default
}
