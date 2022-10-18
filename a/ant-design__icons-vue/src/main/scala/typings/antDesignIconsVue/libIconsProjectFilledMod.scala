package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsProjectFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ProjectFilled", JSImport.Default)
  @js.native
  val default: ProjectFilledIconType = js.native
  
  @js.native
  trait ProjectFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ProjectFilledIconType: String = js.native
  }
  
  type _To = ProjectFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsProjectFilledMod.foo` */
  override def _to: ProjectFilledIconType = default
}
