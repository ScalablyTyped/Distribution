package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowRightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ArrowRightOutlined", JSImport.Default)
  @js.native
  val default: ArrowRightOutlinedIconType = js.native
  
  @js.native
  trait ArrowRightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ArrowRightOutlinedIconType: String = js.native
  }
  
  type _To = ArrowRightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `arrowRightOutlinedMod.foo` */
  override def _to: ArrowRightOutlinedIconType = default
}
