package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leftCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LeftCircleFilled", JSImport.Default)
  @js.native
  val default: LeftCircleFilledIconType = js.native
  
  @js.native
  trait LeftCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LeftCircleFilledIconType: String = js.native
  }
  
  type _To = LeftCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `leftCircleFilledMod.foo` */
  override def _to: LeftCircleFilledIconType = default
}
