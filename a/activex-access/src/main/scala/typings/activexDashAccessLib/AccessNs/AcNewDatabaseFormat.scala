package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcNewDatabaseFormat extends js.Object

@JSGlobal("Access.AcNewDatabaseFormat")
@js.native
object AcNewDatabaseFormat extends js.Object {
  @js.native
  sealed trait acNewDatabaseFormatAccess2000
    extends activexDashAccessLib.AccessNs.AcNewDatabaseFormat
  
  @js.native
  sealed trait acNewDatabaseFormatAccess2002
    extends activexDashAccessLib.AccessNs.AcNewDatabaseFormat
  
  @js.native
  sealed trait acNewDatabaseFormatAccess2007
    extends activexDashAccessLib.AccessNs.AcNewDatabaseFormat
  
  @js.native
  sealed trait acNewDatabaseFormatUserDefault
    extends activexDashAccessLib.AccessNs.AcNewDatabaseFormat
  
  /* 9 */ val acNewDatabaseFormatAccess2000: acNewDatabaseFormatAccess2000 with scala.Double = js.native
  /* 10 */ val acNewDatabaseFormatAccess2002: acNewDatabaseFormatAccess2002 with scala.Double = js.native
  /* 12 */ val acNewDatabaseFormatAccess2007: acNewDatabaseFormatAccess2007 with scala.Double = js.native
  /* 0 */ val acNewDatabaseFormatUserDefault: acNewDatabaseFormatUserDefault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcNewDatabaseFormat with scala.Double] = js.native
}

