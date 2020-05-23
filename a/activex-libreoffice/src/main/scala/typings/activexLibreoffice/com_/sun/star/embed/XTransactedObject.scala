package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows transacted access to an object. */
trait XTransactedObject extends XInterface {
  /** commits the changes made for object. */
  def commit(): Unit
  /** removes all the changes made for the object after last commit or loading. */
  def revert(): Unit
}

object XTransactedObject {
  @scala.inline
  def apply(
    acquire: () => Unit,
    commit: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    revert: () => Unit
  ): XTransactedObject = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), commit = js.Any.fromFunction0(commit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revert = js.Any.fromFunction0(revert))
    __obj.asInstanceOf[XTransactedObject]
  }
}

