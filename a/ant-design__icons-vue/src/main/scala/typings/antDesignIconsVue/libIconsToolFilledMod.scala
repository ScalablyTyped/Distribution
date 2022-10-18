package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsToolFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ToolFilled", JSImport.Default)
  @js.native
  val default: ToolFilledIconType = js.native
  
  @js.native
  trait ToolFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ToolFilledIconType: String = js.native
  }
  
  type _To = ToolFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsToolFilledMod.foo` */
  override def _to: ToolFilledIconType = default
}
