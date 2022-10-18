package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRotateLeftOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RotateLeftOutlined", JSImport.Default)
  @js.native
  val default: RotateLeftOutlinedIconType = js.native
  
  @js.native
  trait RotateLeftOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RotateLeftOutlinedIconType: String = js.native
  }
  
  type _To = RotateLeftOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRotateLeftOutlinedMod.foo` */
  override def _to: RotateLeftOutlinedIconType = default
}
