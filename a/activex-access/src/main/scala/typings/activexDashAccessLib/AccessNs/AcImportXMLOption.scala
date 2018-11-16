package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcImportXMLOption extends js.Object

@JSGlobal("Access.AcImportXMLOption")
@js.native
object AcImportXMLOption extends js.Object {
  @js.native
  sealed trait acAppendData
    extends activexDashAccessLib.AccessNs.AcImportXMLOption
  
  @js.native
  sealed trait acStructureAndData
    extends activexDashAccessLib.AccessNs.AcImportXMLOption
  
  @js.native
  sealed trait acStructureOnly
    extends activexDashAccessLib.AccessNs.AcImportXMLOption
  
  /* 2 */ val acAppendData: acAppendData with scala.Double = js.native
  /* 1 */ val acStructureAndData: acStructureAndData with scala.Double = js.native
  /* 0 */ val acStructureOnly: acStructureOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcImportXMLOption with scala.Double] = js.native
}

