package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFrownOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FrownOutlined", JSImport.Default)
  @js.native
  val default: FrownOutlinedIconType = js.native
  
  @js.native
  trait FrownOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FrownOutlinedIconType: String = js.native
  }
  
  type _To = FrownOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFrownOutlinedMod.foo` */
  override def _to: FrownOutlinedIconType = default
}
