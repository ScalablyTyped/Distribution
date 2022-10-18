package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloseSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseSquareFilled", JSImport.Default)
  @js.native
  val default: CloseSquareFilledIconType = js.native
  
  @js.native
  trait CloseSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloseSquareFilledIconType: String = js.native
  }
  
  type _To = CloseSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloseSquareFilledMod.foo` */
  override def _to: CloseSquareFilledIconType = default
}
