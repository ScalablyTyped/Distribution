package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdReferenceKind extends js.Object

@JSGlobal("Word.WdReferenceKind")
@js.native
object WdReferenceKind extends js.Object {
  @js.native
  sealed trait wdContentText
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdEndnoteNumber
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdEndnoteNumberFormatted
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdEntireCaption
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdFootnoteNumber
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdFootnoteNumberFormatted
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdNumberFullContext
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdNumberNoContext
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdNumberRelativeContext
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdOnlyCaptionText
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdOnlyLabelAndNumber
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdPageNumber
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  @js.native
  sealed trait wdPosition
    extends activexDashWordLib.WordNs.WdReferenceKind
  
  /* -1 */ val wdContentText: wdContentText with scala.Double = js.native
  /* 6 */ val wdEndnoteNumber: wdEndnoteNumber with scala.Double = js.native
  /* 17 */ val wdEndnoteNumberFormatted: wdEndnoteNumberFormatted with scala.Double = js.native
  /* 2 */ val wdEntireCaption: wdEntireCaption with scala.Double = js.native
  /* 5 */ val wdFootnoteNumber: wdFootnoteNumber with scala.Double = js.native
  /* 16 */ val wdFootnoteNumberFormatted: wdFootnoteNumberFormatted with scala.Double = js.native
  /* -4 */ val wdNumberFullContext: wdNumberFullContext with scala.Double = js.native
  /* -3 */ val wdNumberNoContext: wdNumberNoContext with scala.Double = js.native
  /* -2 */ val wdNumberRelativeContext: wdNumberRelativeContext with scala.Double = js.native
  /* 4 */ val wdOnlyCaptionText: wdOnlyCaptionText with scala.Double = js.native
  /* 3 */ val wdOnlyLabelAndNumber: wdOnlyLabelAndNumber with scala.Double = js.native
  /* 7 */ val wdPageNumber: wdPageNumber with scala.Double = js.native
  /* 15 */ val wdPosition: wdPosition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdReferenceKind with scala.Double] = js.native
}

