package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdContentControlDateStorageFormat extends js.Object

@JSGlobal("Word.WdContentControlDateStorageFormat")
@js.native
object WdContentControlDateStorageFormat extends js.Object {
  @js.native
  sealed trait wdContentControlDateStorageDate
    extends activexDashWordLib.WordNs.WdContentControlDateStorageFormat
  
  @js.native
  sealed trait wdContentControlDateStorageDateTime
    extends activexDashWordLib.WordNs.WdContentControlDateStorageFormat
  
  @js.native
  sealed trait wdContentControlDateStorageText
    extends activexDashWordLib.WordNs.WdContentControlDateStorageFormat
  
  /* 1 */ val wdContentControlDateStorageDate: wdContentControlDateStorageDate with scala.Double = js.native
  /* 2 */ val wdContentControlDateStorageDateTime: wdContentControlDateStorageDateTime with scala.Double = js.native
  /* 0 */ val wdContentControlDateStorageText: wdContentControlDateStorageText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdContentControlDateStorageFormat with scala.Double] = js.native
}

