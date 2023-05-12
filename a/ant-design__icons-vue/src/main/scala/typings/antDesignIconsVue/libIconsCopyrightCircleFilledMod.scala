package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCopyrightCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CopyrightCircleFilled", JSImport.Default)
  @js.native
  val default: CopyrightCircleFilledIconType = js.native
  
  @js.native
  trait CopyrightCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CopyrightCircleFilledIconType: String = js.native
  }
  
  type _To = CopyrightCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCopyrightCircleFilledMod.foo` */
  override def _to: CopyrightCircleFilledIconType = default
}
