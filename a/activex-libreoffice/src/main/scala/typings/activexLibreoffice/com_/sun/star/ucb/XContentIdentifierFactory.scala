package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for content identifiers.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentIdentifierFactory extends XInterface {
  /**
    * creates an identifier.
    * @param ContentId the content identifier string.
    * @returns the identifier.
    */
  def createContentIdentifier(ContentId: String): XContentIdentifier
}

object XContentIdentifierFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createContentIdentifier: String => XContentIdentifier,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentIdentifierFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentIdentifierFactory]
  }
}

