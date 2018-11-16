package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCustomXMLValidationErrorType extends js.Object

@JSGlobal("Office.MsoCustomXMLValidationErrorType")
@js.native
object MsoCustomXMLValidationErrorType extends js.Object {
  @js.native
  sealed trait msoCustomXMLValidationErrorAutomaticallyCleared
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLValidationErrorType
  
  @js.native
  sealed trait msoCustomXMLValidationErrorManual
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLValidationErrorType
  
  @js.native
  sealed trait msoCustomXMLValidationErrorSchemaGenerated
    extends activexDashOfficeLib.OfficeNs.MsoCustomXMLValidationErrorType
  
  /* 1 */ val msoCustomXMLValidationErrorAutomaticallyCleared: msoCustomXMLValidationErrorAutomaticallyCleared with scala.Double = js.native
  /* 2 */ val msoCustomXMLValidationErrorManual: msoCustomXMLValidationErrorManual with scala.Double = js.native
  /* 0 */ val msoCustomXMLValidationErrorSchemaGenerated: msoCustomXMLValidationErrorSchemaGenerated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCustomXMLValidationErrorType with scala.Double] = js.native
}

