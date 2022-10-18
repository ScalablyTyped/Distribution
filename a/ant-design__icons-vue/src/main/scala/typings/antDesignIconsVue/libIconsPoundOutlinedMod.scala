package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPoundOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PoundOutlined", JSImport.Default)
  @js.native
  val default: PoundOutlinedIconType = js.native
  
  @js.native
  trait PoundOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PoundOutlinedIconType: String = js.native
  }
  
  type _To = PoundOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPoundOutlinedMod.foo` */
  override def _to: PoundOutlinedIconType = default
}
