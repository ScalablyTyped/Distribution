package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudSyncOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudSyncOutlined", JSImport.Default)
  @js.native
  val default: CloudSyncOutlinedIconType = js.native
  
  @js.native
  trait CloudSyncOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudSyncOutlinedIconType: String = js.native
  }
  
  type _To = CloudSyncOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `cloudSyncOutlinedMod.foo` */
  override def _to: CloudSyncOutlinedIconType = default
}
