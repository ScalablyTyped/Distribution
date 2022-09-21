package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radiusUprightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RadiusUprightOutlined", JSImport.Default)
  @js.native
  val default: RadiusUprightOutlinedIconType = js.native
  
  @js.native
  trait RadiusUprightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RadiusUprightOutlinedIconType: String = js.native
  }
  
  type _To = RadiusUprightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `radiusUprightOutlinedMod.foo` */
  override def _to: RadiusUprightOutlinedIconType = default
}
