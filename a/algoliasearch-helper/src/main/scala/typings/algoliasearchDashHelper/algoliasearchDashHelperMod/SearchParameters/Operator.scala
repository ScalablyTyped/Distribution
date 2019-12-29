package typings.algoliasearchDashHelper.algoliasearchDashHelperMod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Equalssign
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Greaterthansign
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.GreaterthansignEqualssign
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Lessthansign
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.LessthansignEqualssign
  - typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.ExclamationmarkEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

