package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoColorType extends js.Object

@JSGlobal("Office.MsoColorType")
@js.native
object MsoColorType extends js.Object {
  @js.native
  sealed trait msoColorTypeCMS
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  @js.native
  sealed trait msoColorTypeCMYK
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  @js.native
  sealed trait msoColorTypeInk
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  @js.native
  sealed trait msoColorTypeMixed
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  @js.native
  sealed trait msoColorTypeRGB
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  @js.native
  sealed trait msoColorTypeScheme
    extends activexDashOfficeLib.OfficeNs.MsoColorType
  
  /* 4 */ val msoColorTypeCMS: msoColorTypeCMS with scala.Double = js.native
  /* 3 */ val msoColorTypeCMYK: msoColorTypeCMYK with scala.Double = js.native
  /* 5 */ val msoColorTypeInk: msoColorTypeInk with scala.Double = js.native
  /* -2 */ val msoColorTypeMixed: msoColorTypeMixed with scala.Double = js.native
  /* 1 */ val msoColorTypeRGB: msoColorTypeRGB with scala.Double = js.native
  /* 2 */ val msoColorTypeScheme: msoColorTypeScheme with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoColorType with scala.Double] = js.native
}

