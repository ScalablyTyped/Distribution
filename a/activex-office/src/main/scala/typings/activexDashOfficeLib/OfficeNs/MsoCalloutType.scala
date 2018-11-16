package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoCalloutType extends js.Object

@JSGlobal("Office.MsoCalloutType")
@js.native
object MsoCalloutType extends js.Object {
  @js.native
  sealed trait msoCalloutFour
    extends activexDashOfficeLib.OfficeNs.MsoCalloutType
  
  @js.native
  sealed trait msoCalloutMixed
    extends activexDashOfficeLib.OfficeNs.MsoCalloutType
  
  @js.native
  sealed trait msoCalloutOne
    extends activexDashOfficeLib.OfficeNs.MsoCalloutType
  
  @js.native
  sealed trait msoCalloutThree
    extends activexDashOfficeLib.OfficeNs.MsoCalloutType
  
  @js.native
  sealed trait msoCalloutTwo
    extends activexDashOfficeLib.OfficeNs.MsoCalloutType
  
  /* 4 */ val msoCalloutFour: msoCalloutFour with scala.Double = js.native
  /* -2 */ val msoCalloutMixed: msoCalloutMixed with scala.Double = js.native
  /* 1 */ val msoCalloutOne: msoCalloutOne with scala.Double = js.native
  /* 3 */ val msoCalloutThree: msoCalloutThree with scala.Double = js.native
  /* 2 */ val msoCalloutTwo: msoCalloutTwo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoCalloutType with scala.Double] = js.native
}

