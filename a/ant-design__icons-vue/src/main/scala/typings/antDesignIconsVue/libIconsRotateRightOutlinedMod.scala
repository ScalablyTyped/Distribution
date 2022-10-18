package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRotateRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RotateRightOutlined", JSImport.Default)
  @js.native
  val default: RotateRightOutlinedIconType = js.native
  
  @js.native
  trait RotateRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RotateRightOutlinedIconType: String = js.native
  }
  
  type _To = RotateRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRotateRightOutlinedMod.foo` */
  override def _to: RotateRightOutlinedIconType = default
}
