package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDiffOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DiffOutlined", JSImport.Default)
  @js.native
  val default: DiffOutlinedIconType = js.native
  
  @js.native
  trait DiffOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DiffOutlinedIconType: String = js.native
  }
  
  type _To = DiffOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDiffOutlinedMod.foo` */
  override def _to: DiffOutlinedIconType = default
}
