package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCiCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CiCircleFilled", JSImport.Default)
  @js.native
  val default: CiCircleFilledIconType = js.native
  
  @js.native
  trait CiCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CiCircleFilledIconType: String = js.native
  }
  
  type _To = CiCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCiCircleFilledMod.foo` */
  override def _to: CiCircleFilledIconType = default
}
