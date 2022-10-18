package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMobileFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MobileFilled", JSImport.Default)
  @js.native
  val default: MobileFilledIconType = js.native
  
  @js.native
  trait MobileFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MobileFilledIconType: String = js.native
  }
  
  type _To = MobileFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMobileFilledMod.foo` */
  override def _to: MobileFilledIconType = default
}
