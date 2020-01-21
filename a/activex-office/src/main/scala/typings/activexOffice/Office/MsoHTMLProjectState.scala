package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`1`
  - typings.activexOffice.activexOfficeNumbers.`3`
  - typings.activexOffice.activexOfficeNumbers.`2`
*/
trait MsoHTMLProjectState extends js.Object

object MsoHTMLProjectState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoHTMLProjectStateDocumentLocked: `1` = this.cast(1)
  @scala.inline
  def msoHTMLProjectStateDocumentProjectUnlocked: `3` = this.cast(3)
  @scala.inline
  def msoHTMLProjectStateProjectLocked: `2` = this.cast(2)
}

