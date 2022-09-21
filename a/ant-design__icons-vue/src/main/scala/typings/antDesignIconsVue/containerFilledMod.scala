package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContainerFilled", JSImport.Default)
  @js.native
  val default: ContainerFilledIconType = js.native
  
  @js.native
  trait ContainerFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ContainerFilledIconType: String = js.native
  }
  
  type _To = ContainerFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `containerFilledMod.foo` */
  override def _to: ContainerFilledIconType = default
}
