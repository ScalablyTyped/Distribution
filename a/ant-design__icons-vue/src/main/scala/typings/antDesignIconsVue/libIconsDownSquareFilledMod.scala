package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownSquareFilled", JSImport.Default)
  @js.native
  val default: DownSquareFilledIconType = js.native
  
  @js.native
  trait DownSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownSquareFilledIconType: String = js.native
  }
  
  type _To = DownSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownSquareFilledMod.foo` */
  override def _to: DownSquareFilledIconType = default
}
