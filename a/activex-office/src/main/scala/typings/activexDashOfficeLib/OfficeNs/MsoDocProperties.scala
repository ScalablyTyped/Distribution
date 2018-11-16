package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoDocProperties extends js.Object

@JSGlobal("Office.MsoDocProperties")
@js.native
object MsoDocProperties extends js.Object {
  @js.native
  sealed trait msoPropertyTypeBoolean
    extends activexDashOfficeLib.OfficeNs.MsoDocProperties
  
  @js.native
  sealed trait msoPropertyTypeDate
    extends activexDashOfficeLib.OfficeNs.MsoDocProperties
  
  @js.native
  sealed trait msoPropertyTypeFloat
    extends activexDashOfficeLib.OfficeNs.MsoDocProperties
  
  @js.native
  sealed trait msoPropertyTypeNumber
    extends activexDashOfficeLib.OfficeNs.MsoDocProperties
  
  @js.native
  sealed trait msoPropertyTypeString
    extends activexDashOfficeLib.OfficeNs.MsoDocProperties
  
  /* 2 */ val msoPropertyTypeBoolean: msoPropertyTypeBoolean with scala.Double = js.native
  /* 3 */ val msoPropertyTypeDate: msoPropertyTypeDate with scala.Double = js.native
  /* 5 */ val msoPropertyTypeFloat: msoPropertyTypeFloat with scala.Double = js.native
  /* 1 */ val msoPropertyTypeNumber: msoPropertyTypeNumber with scala.Double = js.native
  /* 4 */ val msoPropertyTypeString: msoPropertyTypeString with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoDocProperties with scala.Double] = js.native
}

