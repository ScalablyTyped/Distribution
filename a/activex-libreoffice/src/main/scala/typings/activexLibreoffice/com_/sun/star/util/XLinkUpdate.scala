package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows initiating an update of linked parts of a document. */
trait XLinkUpdate extends XInterface {
  /** initiates the reloading of all linked document content like linked graphics, linked text sections. */
  def updateLinks(): Unit
}

object XLinkUpdate {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateLinks: () => Unit
  ): XLinkUpdate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateLinks = js.Any.fromFunction0(updateLinks))
    __obj.asInstanceOf[XLinkUpdate]
  }
}

