package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsContainerFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContainerFilled", JSImport.Default)
  @js.native
  val default: ContainerFilledIconType = js.native
  
  @js.native
  trait ContainerFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ContainerFilledIconType: String = js.native
  }
  
  type _To = ContainerFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsContainerFilledMod.foo` */
  override def _to: ContainerFilledIconType = default
}
