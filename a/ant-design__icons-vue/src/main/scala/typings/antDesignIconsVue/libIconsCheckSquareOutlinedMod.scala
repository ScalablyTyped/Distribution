package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCheckSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CheckSquareOutlined", JSImport.Default)
  @js.native
  val default: CheckSquareOutlinedIconType = js.native
  
  @js.native
  trait CheckSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CheckSquareOutlinedIconType: String = js.native
  }
  
  type _To = CheckSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCheckSquareOutlinedMod.foo` */
  override def _to: CheckSquareOutlinedIconType = default
}
