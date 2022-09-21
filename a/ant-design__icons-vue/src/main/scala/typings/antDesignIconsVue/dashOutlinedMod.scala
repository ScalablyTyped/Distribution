package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DashOutlined", JSImport.Default)
  @js.native
  val default: DashOutlinedIconType = js.native
  
  @js.native
  trait DashOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DashOutlinedIconType: String = js.native
  }
  
  type _To = DashOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dashOutlinedMod.foo` */
  override def _to: DashOutlinedIconType = default
}
