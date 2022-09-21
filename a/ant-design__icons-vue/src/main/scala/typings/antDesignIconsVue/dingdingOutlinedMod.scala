package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dingdingOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DingdingOutlined", JSImport.Default)
  @js.native
  val default: DingdingOutlinedIconType = js.native
  
  @js.native
  trait DingdingOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DingdingOutlinedIconType: String = js.native
  }
  
  type _To = DingdingOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dingdingOutlinedMod.foo` */
  override def _to: DingdingOutlinedIconType = default
}
