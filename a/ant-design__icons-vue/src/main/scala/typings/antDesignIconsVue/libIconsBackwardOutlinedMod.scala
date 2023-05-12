package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBackwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BackwardOutlined", JSImport.Default)
  @js.native
  val default: BackwardOutlinedIconType = js.native
  
  @js.native
  trait BackwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BackwardOutlinedIconType: String = js.native
  }
  
  type _To = BackwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBackwardOutlinedMod.foo` */
  override def _to: BackwardOutlinedIconType = default
}
