package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdReferenceType extends js.Object

@JSGlobal("Word.WdReferenceType")
@js.native
object WdReferenceType extends js.Object {
  @js.native
  sealed trait wdRefTypeBookmark
    extends activexDashWordLib.WordNs.WdReferenceType
  
  @js.native
  sealed trait wdRefTypeEndnote
    extends activexDashWordLib.WordNs.WdReferenceType
  
  @js.native
  sealed trait wdRefTypeFootnote
    extends activexDashWordLib.WordNs.WdReferenceType
  
  @js.native
  sealed trait wdRefTypeHeading
    extends activexDashWordLib.WordNs.WdReferenceType
  
  @js.native
  sealed trait wdRefTypeNumberedItem
    extends activexDashWordLib.WordNs.WdReferenceType
  
  /* 2 */ val wdRefTypeBookmark: wdRefTypeBookmark with scala.Double = js.native
  /* 4 */ val wdRefTypeEndnote: wdRefTypeEndnote with scala.Double = js.native
  /* 3 */ val wdRefTypeFootnote: wdRefTypeFootnote with scala.Double = js.native
  /* 1 */ val wdRefTypeHeading: wdRefTypeHeading with scala.Double = js.native
  /* 0 */ val wdRefTypeNumberedItem: wdRefTypeNumberedItem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdReferenceType with scala.Double] = js.native
}

