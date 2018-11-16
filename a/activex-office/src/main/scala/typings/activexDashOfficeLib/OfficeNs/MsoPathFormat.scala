package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoPathFormat extends js.Object

@JSGlobal("Office.MsoPathFormat")
@js.native
object MsoPathFormat extends js.Object {
  @js.native
  sealed trait msoPathType1
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  @js.native
  sealed trait msoPathType2
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  @js.native
  sealed trait msoPathType3
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  @js.native
  sealed trait msoPathType4
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  @js.native
  sealed trait msoPathTypeMixed
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  @js.native
  sealed trait msoPathTypeNone
    extends activexDashOfficeLib.OfficeNs.MsoPathFormat
  
  /* 1 */ val msoPathType1: msoPathType1 with scala.Double = js.native
  /* 2 */ val msoPathType2: msoPathType2 with scala.Double = js.native
  /* 3 */ val msoPathType3: msoPathType3 with scala.Double = js.native
  /* 4 */ val msoPathType4: msoPathType4 with scala.Double = js.native
  /* -2 */ val msoPathTypeMixed: msoPathTypeMixed with scala.Double = js.native
  /* 0 */ val msoPathTypeNone: msoPathTypeNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoPathFormat with scala.Double] = js.native
}

