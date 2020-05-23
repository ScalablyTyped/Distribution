package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify how the DDE server application converts its data into numbers.
  * @see com.sun.star.sheet.XDDELinks
  * @since OOo 3.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait DDELinkMode extends js.Object

object DDELinkMode {
  /** numbers are converted into the default format. */
  @scala.inline
  def DEFAULT: `0` = 0.asInstanceOf[`0`]
  /** numbers are converted into the English default format. */
  @scala.inline
  def ENGLISH: `1` = 1.asInstanceOf[`1`]
  /** numbers are not converted, but treated as text. */
  @scala.inline
  def TEXT: `2` = 2.asInstanceOf[`2`]
}

