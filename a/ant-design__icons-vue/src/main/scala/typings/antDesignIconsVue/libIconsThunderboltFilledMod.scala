package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsThunderboltFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ThunderboltFilled", JSImport.Default)
  @js.native
  val default: ThunderboltFilledIconType = js.native
  
  @js.native
  trait ThunderboltFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ThunderboltFilledIconType: String = js.native
  }
  
  type _To = ThunderboltFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsThunderboltFilledMod.foo` */
  override def _to: ThunderboltFilledIconType = default
}
