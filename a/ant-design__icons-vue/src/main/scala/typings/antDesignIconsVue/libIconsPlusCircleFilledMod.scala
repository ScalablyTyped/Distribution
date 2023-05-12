package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPlusCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PlusCircleFilled", JSImport.Default)
  @js.native
  val default: PlusCircleFilledIconType = js.native
  
  @js.native
  trait PlusCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PlusCircleFilledIconType: String = js.native
  }
  
  type _To = PlusCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPlusCircleFilledMod.foo` */
  override def _to: PlusCircleFilledIconType = default
}
