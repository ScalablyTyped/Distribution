package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDribbbleSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DribbbleSquareOutlined", JSImport.Default)
  @js.native
  val default: DribbbleSquareOutlinedIconType = js.native
  
  @js.native
  trait DribbbleSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DribbbleSquareOutlinedIconType: String = js.native
  }
  
  type _To = DribbbleSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDribbbleSquareOutlinedMod.foo` */
  override def _to: DribbbleSquareOutlinedIconType = default
}
