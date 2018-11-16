package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcExportXMLSchemaFormat extends js.Object

@JSGlobal("Access.AcExportXMLSchemaFormat")
@js.native
object AcExportXMLSchemaFormat extends js.Object {
  @js.native
  sealed trait acSchemaNone
    extends activexDashAccessLib.AccessNs.AcExportXMLSchemaFormat
  
  @js.native
  sealed trait acSchemaXSD
    extends activexDashAccessLib.AccessNs.AcExportXMLSchemaFormat
  
  /* 0 */ val acSchemaNone: acSchemaNone with scala.Double = js.native
  /* 1 */ val acSchemaXSD: acSchemaXSD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcExportXMLSchemaFormat with scala.Double] = js.native
}

