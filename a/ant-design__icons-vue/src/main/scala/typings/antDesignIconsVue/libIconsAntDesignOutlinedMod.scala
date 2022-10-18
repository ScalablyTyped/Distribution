package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAntDesignOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AntDesignOutlined", JSImport.Default)
  @js.native
  val default: AntDesignOutlinedIconType = js.native
  
  @js.native
  trait AntDesignOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AntDesignOutlinedIconType: String = js.native
  }
  
  type _To = AntDesignOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAntDesignOutlinedMod.foo` */
  override def _to: AntDesignOutlinedIconType = default
}
