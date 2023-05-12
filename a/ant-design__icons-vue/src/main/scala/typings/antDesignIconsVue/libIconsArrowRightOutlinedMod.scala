package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsArrowRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowRightOutlined", JSImport.Default)
  @js.native
  val default: ArrowRightOutlinedIconType = js.native
  
  @js.native
  trait ArrowRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ArrowRightOutlinedIconType: String = js.native
  }
  
  type _To = ArrowRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsArrowRightOutlinedMod.foo` */
  override def _to: ArrowRightOutlinedIconType = default
}
