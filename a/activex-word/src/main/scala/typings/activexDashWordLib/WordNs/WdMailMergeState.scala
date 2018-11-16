package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeState extends js.Object

@JSGlobal("Word.WdMailMergeState")
@js.native
object WdMailMergeState extends js.Object {
  @js.native
  sealed trait wdDataSource
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  @js.native
  sealed trait wdMainAndDataSource
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  @js.native
  sealed trait wdMainAndHeader
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  @js.native
  sealed trait wdMainAndSourceAndHeader
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  @js.native
  sealed trait wdMainDocumentOnly
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  @js.native
  sealed trait wdNormalDocument
    extends activexDashWordLib.WordNs.WdMailMergeState
  
  /* 5 */ val wdDataSource: wdDataSource with scala.Double = js.native
  /* 2 */ val wdMainAndDataSource: wdMainAndDataSource with scala.Double = js.native
  /* 3 */ val wdMainAndHeader: wdMainAndHeader with scala.Double = js.native
  /* 4 */ val wdMainAndSourceAndHeader: wdMainAndSourceAndHeader with scala.Double = js.native
  /* 1 */ val wdMainDocumentOnly: wdMainDocumentOnly with scala.Double = js.native
  /* 0 */ val wdNormalDocument: wdNormalDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeState with scala.Double] = js.native
}

