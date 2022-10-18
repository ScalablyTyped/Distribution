package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsMediumCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MediumCircleFilled", JSImport.Default)
  @js.native
  val default: MediumCircleFilledIconType = js.native
  
  @js.native
  trait MediumCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MediumCircleFilledIconType: String = js.native
  }
  
  type _To = MediumCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsMediumCircleFilledMod.foo` */
  override def _to: MediumCircleFilledIconType = default
}
