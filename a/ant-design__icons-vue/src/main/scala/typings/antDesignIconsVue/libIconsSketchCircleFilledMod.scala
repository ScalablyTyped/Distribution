package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSketchCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SketchCircleFilled", JSImport.Default)
  @js.native
  val default: SketchCircleFilledIconType = js.native
  
  @js.native
  trait SketchCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SketchCircleFilledIconType: String = js.native
  }
  
  type _To = SketchCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSketchCircleFilledMod.foo` */
  override def _to: SketchCircleFilledIconType = default
}
