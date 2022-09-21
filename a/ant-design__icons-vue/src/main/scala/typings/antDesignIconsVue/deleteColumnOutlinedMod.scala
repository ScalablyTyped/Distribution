package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteColumnOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeleteColumnOutlined", JSImport.Default)
  @js.native
  val default: DeleteColumnOutlinedIconType = js.native
  
  @js.native
  trait DeleteColumnOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DeleteColumnOutlinedIconType: String = js.native
  }
  
  type _To = DeleteColumnOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `deleteColumnOutlinedMod.foo` */
  override def _to: DeleteColumnOutlinedIconType = default
}
