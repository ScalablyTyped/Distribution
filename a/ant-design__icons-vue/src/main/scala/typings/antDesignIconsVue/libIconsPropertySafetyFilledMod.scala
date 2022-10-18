package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPropertySafetyFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PropertySafetyFilled", JSImport.Default)
  @js.native
  val default: PropertySafetyFilledIconType = js.native
  
  @js.native
  trait PropertySafetyFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PropertySafetyFilledIconType: String = js.native
  }
  
  type _To = PropertySafetyFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPropertySafetyFilledMod.foo` */
  override def _to: PropertySafetyFilledIconType = default
}
