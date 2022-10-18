package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPropertySafetyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PropertySafetyOutlined", JSImport.Default)
  @js.native
  val default: PropertySafetyOutlinedIconType = js.native
  
  @js.native
  trait PropertySafetyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PropertySafetyOutlinedIconType: String = js.native
  }
  
  type _To = PropertySafetyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPropertySafetyOutlinedMod.foo` */
  override def _to: PropertySafetyOutlinedIconType = default
}
