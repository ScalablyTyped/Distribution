package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRightSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightSquareFilled", JSImport.Default)
  @js.native
  val default: RightSquareFilledIconType = js.native
  
  @js.native
  trait RightSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RightSquareFilledIconType: String = js.native
  }
  
  type _To = RightSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRightSquareFilledMod.foo` */
  override def _to: RightSquareFilledIconType = default
}
