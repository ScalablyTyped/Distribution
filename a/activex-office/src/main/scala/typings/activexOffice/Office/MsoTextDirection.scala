package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`-2`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`1`
  - typings.activexOffice.activexOfficeNumbers.`-2`
  - typings.activexOffice.activexOfficeNumbers.`2`
*/
trait MsoTextDirection extends js.Object

object MsoTextDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoTextDirectionLeftToRight: `1` = this.cast(1)
  @scala.inline
  def msoTextDirectionMixed: `-2` = this.cast(-2)
  @scala.inline
  def msoTextDirectionRightToLeft: `2` = this.cast(2)
}

