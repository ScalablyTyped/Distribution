package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSyncOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SyncOutlined", JSImport.Default)
  @js.native
  val default: SyncOutlinedIconType = js.native
  
  @js.native
  trait SyncOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SyncOutlinedIconType: String = js.native
  }
  
  type _To = SyncOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSyncOutlinedMod.foo` */
  override def _to: SyncOutlinedIconType = default
}
