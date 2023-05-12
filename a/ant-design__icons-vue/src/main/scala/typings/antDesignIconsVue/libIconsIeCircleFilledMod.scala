package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsIeCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/IeCircleFilled", JSImport.Default)
  @js.native
  val default: IeCircleFilledIconType = js.native
  
  @js.native
  trait IeCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_IeCircleFilledIconType: String = js.native
  }
  
  type _To = IeCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsIeCircleFilledMod.foo` */
  override def _to: IeCircleFilledIconType = default
}
