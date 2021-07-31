package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Cascade
import typings.antdMobile.anon.MaskTransitionName
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  @JSImport("antd-mobile/lib/picker", JSImport.Default)
  @js.native
  class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/picker", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/picker", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    @scala.inline
    def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile/lib/picker", "nonsense")
  @js.native
  val nonsense: Element = js.native
  
  @js.native
  trait Picker
    extends typings.antdMobile.abstractPickerMod.default {
    
    var popupProps: MaskTransitionName = js.native
  }
}
