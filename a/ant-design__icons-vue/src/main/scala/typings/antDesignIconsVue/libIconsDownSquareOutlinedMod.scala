package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownSquareOutlined", JSImport.Default)
  @js.native
  val default: DownSquareOutlinedIconType = js.native
  
  @js.native
  trait DownSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownSquareOutlinedIconType: String = js.native
  }
  
  type _To = DownSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownSquareOutlinedMod.foo` */
  override def _to: DownSquareOutlinedIconType = default
}
