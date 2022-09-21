package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloudFilled", JSImport.Default)
  @js.native
  val default: CloudFilledIconType = js.native
  
  @js.native
  trait CloudFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CloudFilledIconType: String = js.native
  }
  
  type _To = CloudFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `cloudFilledMod.foo` */
  override def _to: CloudFilledIconType = default
}
