package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFacebookFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FacebookFilled", JSImport.Default)
  @js.native
  val default: FacebookFilledIconType = js.native
  
  @js.native
  trait FacebookFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FacebookFilledIconType: String = js.native
  }
  
  type _To = FacebookFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFacebookFilledMod.foo` */
  override def _to: FacebookFilledIconType = default
}
