package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dribbbleCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DribbbleCircleFilled", JSImport.Default)
  @js.native
  val default: DribbbleCircleFilledIconType = js.native
  
  @js.native
  trait DribbbleCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DribbbleCircleFilledIconType: String = js.native
  }
  
  type _To = DribbbleCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `dribbbleCircleFilledMod.foo` */
  override def _to: DribbbleCircleFilledIconType = default
}
