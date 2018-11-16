package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPickerField extends js.Object

@JSGlobal("Office.MsoPickerField")
@js.native
object MsoPickerField extends js.Object {
  @js.native
  sealed trait msoPickerFieldDateTime
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  @js.native
  sealed trait msoPickerFieldMax
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  @js.native
  sealed trait msoPickerFieldNumber
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  @js.native
  sealed trait msoPickerFieldText
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  @js.native
  sealed trait msoPickerFieldUnknown
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  @js.native
  sealed trait msoPickerFieldUser
    extends activexDashOfficeLib.OfficeNs.MsoPickerField
  
  /* 1 */ val msoPickerFieldDateTime: msoPickerFieldDateTime with scala.Double = js.native
  /* 5 */ val msoPickerFieldMax: msoPickerFieldMax with scala.Double = js.native
  /* 2 */ val msoPickerFieldNumber: msoPickerFieldNumber with scala.Double = js.native
  /* 3 */ val msoPickerFieldText: msoPickerFieldText with scala.Double = js.native
  /* 0 */ val msoPickerFieldUnknown: msoPickerFieldUnknown with scala.Double = js.native
  /* 4 */ val msoPickerFieldUser: msoPickerFieldUser with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPickerField with scala.Double] = js.native
}

