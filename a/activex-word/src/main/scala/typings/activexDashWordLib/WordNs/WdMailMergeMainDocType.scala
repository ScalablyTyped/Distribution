package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailMergeMainDocType extends js.Object

@JSGlobal("Word.WdMailMergeMainDocType")
@js.native
object WdMailMergeMainDocType extends js.Object {
  @js.native
  sealed trait wdCatalog
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdDirectory
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdEMail
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdEnvelopes
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdFax
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdFormLetters
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdMailingLabels
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  @js.native
  sealed trait wdNotAMergeDocument
    extends activexDashWordLib.WordNs.WdMailMergeMainDocType
  
  /* 3 */ val wdCatalog: wdCatalog with scala.Double = js.native
  /* 3 */ val wdDirectory: wdDirectory with scala.Double = js.native
  /* 4 */ val wdEMail: wdEMail with scala.Double = js.native
  /* 2 */ val wdEnvelopes: wdEnvelopes with scala.Double = js.native
  /* 5 */ val wdFax: wdFax with scala.Double = js.native
  /* 0 */ val wdFormLetters: wdFormLetters with scala.Double = js.native
  /* 1 */ val wdMailingLabels: wdMailingLabels with scala.Double = js.native
  /* -1 */ val wdNotAMergeDocument: wdNotAMergeDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailMergeMainDocType with scala.Double] = js.native
}

