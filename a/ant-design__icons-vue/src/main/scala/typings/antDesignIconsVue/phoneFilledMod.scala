package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PhoneFilled", JSImport.Default)
  @js.native
  val default: PhoneFilledIconType = js.native
  
  @js.native
  trait PhoneFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PhoneFilledIconType: String = js.native
  }
  
  type _To = PhoneFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `phoneFilledMod.foo` */
  override def _to: PhoneFilledIconType = default
}
