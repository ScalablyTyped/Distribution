package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCrownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CrownOutlined", JSImport.Default)
  @js.native
  val default: CrownOutlinedIconType = js.native
  
  @js.native
  trait CrownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CrownOutlinedIconType: String = js.native
  }
  
  type _To = CrownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCrownOutlinedMod.foo` */
  override def _to: CrownOutlinedIconType = default
}
