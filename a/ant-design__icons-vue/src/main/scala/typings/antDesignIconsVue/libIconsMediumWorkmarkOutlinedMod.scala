package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMediumWorkmarkOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MediumWorkmarkOutlined", JSImport.Default)
  @js.native
  val default: MediumWorkmarkOutlinedIconType = js.native
  
  @js.native
  trait MediumWorkmarkOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_MediumWorkmarkOutlinedIconType: String = js.native
  }
  
  type _To = MediumWorkmarkOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMediumWorkmarkOutlinedMod.foo` */
  override def _to: MediumWorkmarkOutlinedIconType = default
}
