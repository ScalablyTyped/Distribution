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
@js.native
trait XContentIdentifierFactory extends XInterface {
  /**
    * creates an identifier.
    * @param ContentId the content identifier string.
    * @returns the identifier.
    */
  def createContentIdentifier(ContentId: String): XContentIdentifier = js.native
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
  @scala.inline
  implicit class XContentIdentifierFactoryOps[Self <: XContentIdentifierFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateContentIdentifier(value: String => XContentIdentifier): Self = this.set("createContentIdentifier", js.Any.fromFunction1(value))
  }
  
}

