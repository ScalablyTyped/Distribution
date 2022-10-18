package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMediumOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MediumOutlined", JSImport.Default)
  @js.native
  val default: MediumOutlinedIconType = js.native
  
  @js.native
  trait MediumOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MediumOutlinedIconType: String = js.native
  }
  
  type _To = MediumOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMediumOutlinedMod.foo` */
  override def _to: MediumOutlinedIconType = default
}
