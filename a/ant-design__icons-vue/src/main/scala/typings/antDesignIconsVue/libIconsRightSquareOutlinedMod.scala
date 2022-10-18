package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRightSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightSquareOutlined", JSImport.Default)
  @js.native
  val default: RightSquareOutlinedIconType = js.native
  
  @js.native
  trait RightSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RightSquareOutlinedIconType: String = js.native
  }
  
  type _To = RightSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRightSquareOutlinedMod.foo` */
  override def _to: RightSquareOutlinedIconType = default
}
