package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InfoCircleFilled", JSImport.Default)
  @js.native
  val default: InfoCircleFilledIconType = js.native
  
  @js.native
  trait InfoCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InfoCircleFilledIconType: String = js.native
  }
  
  type _To = InfoCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `infoCircleFilledMod.foo` */
  override def _to: InfoCircleFilledIconType = default
}
