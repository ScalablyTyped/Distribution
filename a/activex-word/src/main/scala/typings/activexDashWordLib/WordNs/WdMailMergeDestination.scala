package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeDestination extends js.Object

@JSGlobal("Word.WdMailMergeDestination")
@js.native
object WdMailMergeDestination extends js.Object {
  @js.native
  sealed trait wdSendToEmail
    extends activexDashWordLib.WordNs.WdMailMergeDestination
  
  @js.native
  sealed trait wdSendToFax
    extends activexDashWordLib.WordNs.WdMailMergeDestination
  
  @js.native
  sealed trait wdSendToNewDocument
    extends activexDashWordLib.WordNs.WdMailMergeDestination
  
  @js.native
  sealed trait wdSendToPrinter
    extends activexDashWordLib.WordNs.WdMailMergeDestination
  
  /* 2 */ val wdSendToEmail: wdSendToEmail with scala.Double = js.native
  /* 3 */ val wdSendToFax: wdSendToFax with scala.Double = js.native
  /* 0 */ val wdSendToNewDocument: wdSendToNewDocument with scala.Double = js.native
  /* 1 */ val wdSendToPrinter: wdSendToPrinter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeDestination with scala.Double] = js.native
}

