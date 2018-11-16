package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocProperties extends js.Object

@JSGlobal("Office.DocProperties")
@js.native
object DocProperties extends js.Object {
  @js.native
  sealed trait offPropertyTypeBoolean
    extends activexDashOfficeLib.OfficeNs.DocProperties
  
  @js.native
  sealed trait offPropertyTypeDate
    extends activexDashOfficeLib.OfficeNs.DocProperties
  
  @js.native
  sealed trait offPropertyTypeFloat
    extends activexDashOfficeLib.OfficeNs.DocProperties
  
  @js.native
  sealed trait offPropertyTypeNumber
    extends activexDashOfficeLib.OfficeNs.DocProperties
  
  @js.native
  sealed trait offPropertyTypeString
    extends activexDashOfficeLib.OfficeNs.DocProperties
  
  /* 2 */ val offPropertyTypeBoolean: offPropertyTypeBoolean with scala.Double = js.native
  /* 3 */ val offPropertyTypeDate: offPropertyTypeDate with scala.Double = js.native
  /* 5 */ val offPropertyTypeFloat: offPropertyTypeFloat with scala.Double = js.native
  /* 1 */ val offPropertyTypeNumber: offPropertyTypeNumber with scala.Double = js.native
  /* 4 */ val offPropertyTypeString: offPropertyTypeString with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.DocProperties with scala.Double] = js.native
}

