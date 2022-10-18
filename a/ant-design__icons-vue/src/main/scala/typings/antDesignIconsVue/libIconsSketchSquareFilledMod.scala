package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSketchSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SketchSquareFilled", JSImport.Default)
  @js.native
  val default: SketchSquareFilledIconType = js.native
  
  @js.native
  trait SketchSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SketchSquareFilledIconType: String = js.native
  }
  
  type _To = SketchSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSketchSquareFilledMod.foo` */
  override def _to: SketchSquareFilledIconType = default
}
