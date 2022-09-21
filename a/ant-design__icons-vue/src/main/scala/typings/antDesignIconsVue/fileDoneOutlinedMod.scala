package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileDoneOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FileDoneOutlined", JSImport.Default)
  @js.native
  val default: FileDoneOutlinedIconType = js.native
  
  @js.native
  trait FileDoneOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FileDoneOutlinedIconType: String = js.native
  }
  
  type _To = FileDoneOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `fileDoneOutlinedMod.foo` */
  override def _to: FileDoneOutlinedIconType = default
}
