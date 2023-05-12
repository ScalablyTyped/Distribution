package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDownCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DownCircleOutlined", JSImport.Default)
  @js.native
  val default: DownCircleOutlinedIconType = js.native
  
  @js.native
  trait DownCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DownCircleOutlinedIconType: String = js.native
  }
  
  type _To = DownCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDownCircleOutlinedMod.foo` */
  override def _to: DownCircleOutlinedIconType = default
}
