package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPrintOutItem extends js.Object

@JSGlobal("Word.WdPrintOutItem")
@js.native
object WdPrintOutItem extends js.Object {
  @js.native
  sealed trait wdPrintAutoTextEntries
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintComments
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintDocumentContent
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintDocumentWithMarkup
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintEnvelope
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintKeyAssignments
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintMarkup
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintProperties
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  @js.native
  sealed trait wdPrintStyles
    extends activexDashWordLib.WordNs.WdPrintOutItem
  
  /* 4 */ val wdPrintAutoTextEntries: wdPrintAutoTextEntries with scala.Double = js.native
  /* 2 */ val wdPrintComments: wdPrintComments with scala.Double = js.native
  /* 0 */ val wdPrintDocumentContent: wdPrintDocumentContent with scala.Double = js.native
  /* 7 */ val wdPrintDocumentWithMarkup: wdPrintDocumentWithMarkup with scala.Double = js.native
  /* 6 */ val wdPrintEnvelope: wdPrintEnvelope with scala.Double = js.native
  /* 5 */ val wdPrintKeyAssignments: wdPrintKeyAssignments with scala.Double = js.native
  /* 2 */ val wdPrintMarkup: wdPrintMarkup with scala.Double = js.native
  /* 1 */ val wdPrintProperties: wdPrintProperties with scala.Double = js.native
  /* 3 */ val wdPrintStyles: wdPrintStyles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPrintOutItem with scala.Double] = js.native
}

