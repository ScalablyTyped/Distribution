package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushpinOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PushpinOutlined", JSImport.Default)
  @js.native
  val default: PushpinOutlinedIconType = js.native
  
  @js.native
  trait PushpinOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PushpinOutlinedIconType: String = js.native
  }
  
  type _To = PushpinOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `pushpinOutlinedMod.foo` */
  override def _to: PushpinOutlinedIconType = default
}
