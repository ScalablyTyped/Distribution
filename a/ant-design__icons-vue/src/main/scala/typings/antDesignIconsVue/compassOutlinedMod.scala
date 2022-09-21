package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compassOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CompassOutlined", JSImport.Default)
  @js.native
  val default: CompassOutlinedIconType = js.native
  
  @js.native
  trait CompassOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CompassOutlinedIconType: String = js.native
  }
  
  type _To = CompassOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `compassOutlinedMod.foo` */
  override def _to: CompassOutlinedIconType = default
}
