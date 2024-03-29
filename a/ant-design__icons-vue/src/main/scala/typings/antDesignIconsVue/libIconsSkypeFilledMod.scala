package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSkypeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SkypeFilled", JSImport.Default)
  @js.native
  val default: SkypeFilledIconType = js.native
  
  @js.native
  trait SkypeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SkypeFilledIconType: String = js.native
  }
  
  type _To = SkypeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSkypeFilledMod.foo` */
  override def _to: SkypeFilledIconType = default
}
