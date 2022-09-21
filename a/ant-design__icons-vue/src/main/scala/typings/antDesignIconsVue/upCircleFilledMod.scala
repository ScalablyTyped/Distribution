package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UpCircleFilled", JSImport.Default)
  @js.native
  val default: UpCircleFilledIconType = js.native
  
  @js.native
  trait UpCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UpCircleFilledIconType: String = js.native
  }
  
  type _To = UpCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `upCircleFilledMod.foo` */
  override def _to: UpCircleFilledIconType = default
}
