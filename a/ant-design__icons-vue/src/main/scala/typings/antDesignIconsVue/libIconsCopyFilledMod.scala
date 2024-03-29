package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyFilled", JSImport.Default)
  @js.native
  val default: CopyFilledIconType = js.native
  
  @js.native
  trait CopyFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CopyFilledIconType: String = js.native
  }
  
  type _To = CopyFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyFilledMod.foo` */
  override def _to: CopyFilledIconType = default
}
