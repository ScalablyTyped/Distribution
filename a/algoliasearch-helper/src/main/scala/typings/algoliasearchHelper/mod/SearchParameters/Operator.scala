package typings.algoliasearchHelper.mod.SearchParameters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.algoliasearchHelper.algoliasearchHelperStrings.Equalssign
  - typings.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign
  - typings.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign
  - typings.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign
  - typings.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign
  - typings.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign
*/
trait Operator extends js.Object

object Operator {
  @scala.inline
  def Equalssign: typings.algoliasearchHelper.algoliasearchHelperStrings.Equalssign = this.cast("=")
  @scala.inline
  def ExclamationmarkEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign = this.cast("!=")
  @scala.inline
  def Greaterthansign: typings.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

