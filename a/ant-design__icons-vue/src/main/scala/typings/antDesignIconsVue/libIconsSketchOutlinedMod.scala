package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSketchOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SketchOutlined", JSImport.Default)
  @js.native
  val default: SketchOutlinedIconType = js.native
  
  @js.native
  trait SketchOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SketchOutlinedIconType: String = js.native
  }
  
  type _To = SketchOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSketchOutlinedMod.foo` */
  override def _to: SketchOutlinedIconType = default
}
