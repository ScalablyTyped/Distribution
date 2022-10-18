package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloseSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseSquareOutlined", JSImport.Default)
  @js.native
  val default: CloseSquareOutlinedIconType = js.native
  
  @js.native
  trait CloseSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloseSquareOutlinedIconType: String = js.native
  }
  
  type _To = CloseSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloseSquareOutlinedMod.foo` */
  override def _to: CloseSquareOutlinedIconType = default
}
