package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeDataSource extends js.Object

@JSGlobal("Word.WdMailMergeDataSource")
@js.native
object WdMailMergeDataSource extends js.Object {
  @js.native
  sealed trait wdMergeInfoFromAccessDDE
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdMergeInfoFromExcelDDE
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdMergeInfoFromMSQueryDDE
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdMergeInfoFromODBC
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdMergeInfoFromODSO
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdMergeInfoFromWord
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  @js.native
  sealed trait wdNoMergeInfo
    extends activexDashWordLib.WordNs.WdMailMergeDataSource
  
  /* 1 */ val wdMergeInfoFromAccessDDE: wdMergeInfoFromAccessDDE with scala.Double = js.native
  /* 2 */ val wdMergeInfoFromExcelDDE: wdMergeInfoFromExcelDDE with scala.Double = js.native
  /* 3 */ val wdMergeInfoFromMSQueryDDE: wdMergeInfoFromMSQueryDDE with scala.Double = js.native
  /* 4 */ val wdMergeInfoFromODBC: wdMergeInfoFromODBC with scala.Double = js.native
  /* 5 */ val wdMergeInfoFromODSO: wdMergeInfoFromODSO with scala.Double = js.native
  /* 0 */ val wdMergeInfoFromWord: wdMergeInfoFromWord with scala.Double = js.native
  /* -1 */ val wdNoMergeInfo: wdNoMergeInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeDataSource with scala.Double] = js.native
}

