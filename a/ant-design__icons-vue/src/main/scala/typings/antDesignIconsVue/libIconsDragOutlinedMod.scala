package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDragOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DragOutlined", JSImport.Default)
  @js.native
  val default: DragOutlinedIconType = js.native
  
  @js.native
  trait DragOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_DragOutlinedIconType: String = js.native
  }
  
  type _To = DragOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDragOutlinedMod.foo` */
  override def _to: DragOutlinedIconType = default
}
