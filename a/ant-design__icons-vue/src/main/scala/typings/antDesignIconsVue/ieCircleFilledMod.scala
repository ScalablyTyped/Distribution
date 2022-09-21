package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IeCircleFilled", JSImport.Default)
  @js.native
  val default: IeCircleFilledIconType = js.native
  
  @js.native
  trait IeCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IeCircleFilledIconType: String = js.native
  }
  
  type _To = IeCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `ieCircleFilledMod.foo` */
  override def _to: IeCircleFilledIconType = default
}
