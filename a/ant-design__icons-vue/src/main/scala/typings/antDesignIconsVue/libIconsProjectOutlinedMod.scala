package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsProjectOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ProjectOutlined", JSImport.Default)
  @js.native
  val default: ProjectOutlinedIconType = js.native
  
  @js.native
  trait ProjectOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ProjectOutlinedIconType: String = js.native
  }
  
  type _To = ProjectOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsProjectOutlinedMod.foo` */
  override def _to: ProjectOutlinedIconType = default
}
