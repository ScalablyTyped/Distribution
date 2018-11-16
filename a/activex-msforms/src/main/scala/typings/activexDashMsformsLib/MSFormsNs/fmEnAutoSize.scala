package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmEnAutoSize extends js.Object

@JSGlobal("MSForms.fmEnAutoSize")
@js.native
object fmEnAutoSize extends js.Object {
  @js.native
  sealed trait _fmEnAutoSizeBoth
    extends activexDashMsformsLib.MSFormsNs.fmEnAutoSize
  
  @js.native
  sealed trait _fmEnAutoSizeHorizontal
    extends activexDashMsformsLib.MSFormsNs.fmEnAutoSize
  
  @js.native
  sealed trait _fmEnAutoSizeNone
    extends activexDashMsformsLib.MSFormsNs.fmEnAutoSize
  
  @js.native
  sealed trait _fmEnAutoSizeVertical
    extends activexDashMsformsLib.MSFormsNs.fmEnAutoSize
  
  /* 3 */ val _fmEnAutoSizeBoth: _fmEnAutoSizeBoth with scala.Double = js.native
  /* 1 */ val _fmEnAutoSizeHorizontal: _fmEnAutoSizeHorizontal with scala.Double = js.native
  /* 0 */ val _fmEnAutoSizeNone: _fmEnAutoSizeNone with scala.Double = js.native
  /* 2 */ val _fmEnAutoSizeVertical: _fmEnAutoSizeVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmEnAutoSize with scala.Double] = js.native
}

