package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlaySquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlaySquareFilled", JSImport.Default)
  @js.native
  val default: PlaySquareFilledIconType = js.native
  
  @js.native
  trait PlaySquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PlaySquareFilledIconType: String = js.native
  }
  
  type _To = PlaySquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlaySquareFilledMod.foo` */
  override def _to: PlaySquareFilledIconType = default
}
