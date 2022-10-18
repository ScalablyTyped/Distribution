package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsApartmentOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ApartmentOutlined", JSImport.Default)
  @js.native
  val default: ApartmentOutlinedIconType = js.native
  
  @js.native
  trait ApartmentOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ApartmentOutlinedIconType: String = js.native
  }
  
  type _To = ApartmentOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsApartmentOutlinedMod.foo` */
  override def _to: ApartmentOutlinedIconType = default
}
