package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteRowOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DeleteRowOutlined", JSImport.Default)
  @js.native
  val default: DeleteRowOutlinedIconType = js.native
  
  @js.native
  trait DeleteRowOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DeleteRowOutlinedIconType: String = js.native
  }
  
  type _To = DeleteRowOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `deleteRowOutlinedMod.foo` */
  override def _to: DeleteRowOutlinedIconType = default
}
