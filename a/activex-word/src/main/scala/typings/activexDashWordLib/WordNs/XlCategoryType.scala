package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCategoryType extends js.Object

@JSGlobal("Word.XlCategoryType")
@js.native
object XlCategoryType extends js.Object {
  @js.native
  sealed trait xlAutomaticScale
    extends activexDashWordLib.WordNs.XlCategoryType
  
  @js.native
  sealed trait xlCategoryScale
    extends activexDashWordLib.WordNs.XlCategoryType
  
  @js.native
  sealed trait xlTimeScale
    extends activexDashWordLib.WordNs.XlCategoryType
  
  /* -4105 */ val xlAutomaticScale: xlAutomaticScale with scala.Double = js.native
  /* 2 */ val xlCategoryScale: xlCategoryScale with scala.Double = js.native
  /* 3 */ val xlTimeScale: xlTimeScale with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlCategoryType with scala.Double] = js.native
}

