package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifiedOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/VerifiedOutlined", JSImport.Default)
  @js.native
  val default: VerifiedOutlinedIconType = js.native
  
  @js.native
  trait VerifiedOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_VerifiedOutlinedIconType: String = js.native
  }
  
  type _To = VerifiedOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `verifiedOutlinedMod.foo` */
  override def _to: VerifiedOutlinedIconType = default
}
