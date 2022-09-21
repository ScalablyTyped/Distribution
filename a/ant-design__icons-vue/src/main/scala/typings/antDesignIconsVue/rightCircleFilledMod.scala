package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rightCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RightCircleFilled", JSImport.Default)
  @js.native
  val default: RightCircleFilledIconType = js.native
  
  @js.native
  trait RightCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RightCircleFilledIconType: String = js.native
  }
  
  type _To = RightCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `rightCircleFilledMod.foo` */
  override def _to: RightCircleFilledIconType = default
}
