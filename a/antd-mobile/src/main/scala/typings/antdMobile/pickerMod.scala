package typings.antdMobile

import typings.antdMobile.abstractPickerMod.AbstractPicker
import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Cascade
import typings.antdMobile.anon.MaskTransitionName
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/picker", JSImport.Namespace)
@js.native
object pickerMod extends js.Object {
  @js.native
  trait Picker extends AbstractPicker {
    var popupProps: MaskTransitionName = js.native
  }
  
  @js.native
  class default () extends Picker
  
  val nonsense: Element = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AntLocale = js.native
    var defaultProps: Cascade = js.native
  }
  
}

