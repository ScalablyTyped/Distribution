package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcExportXMLOtherFlags extends js.Object

@JSGlobal("Access.AcExportXMLOtherFlags")
@js.native
object AcExportXMLOtherFlags extends js.Object {
  @js.native
  sealed trait acEmbedSchema
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  @js.native
  sealed trait acExcludePrimaryKeyAndIndexes
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  @js.native
  sealed trait acExportAllTableAndFieldProperties
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  @js.native
  sealed trait acLiveReportSource
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  @js.native
  sealed trait acPersistReportML
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  @js.native
  sealed trait acRunFromServer
    extends activexDashAccessLib.AccessNs.AcExportXMLOtherFlags
  
  /* 1 */ val acEmbedSchema: acEmbedSchema with scala.Double = js.native
  /* 2 */ val acExcludePrimaryKeyAndIndexes: acExcludePrimaryKeyAndIndexes with scala.Double = js.native
  /* 32 */ val acExportAllTableAndFieldProperties: acExportAllTableAndFieldProperties with scala.Double = js.native
  /* 8 */ val acLiveReportSource: acLiveReportSource with scala.Double = js.native
  /* 16 */ val acPersistReportML: acPersistReportML with scala.Double = js.native
  /* 4 */ val acRunFromServer: acRunFromServer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcExportXMLOtherFlags with scala.Double] = js.native
}

