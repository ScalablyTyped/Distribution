package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to duplicate pages within the same document. */
trait XDrawPageDuplicator extends XInterface {
  /**
    * creates a duplicate of a {@link DrawPage} or {@link MasterPage} , including the {@link Shapes} on that page and inserts it into the same model.
    * @param xPage that is the source {@link DrawPage} or {@link MasterPage} that will be duplicated
    * @returns a newly created {@link DrawPage} or {@link MasterPage} that as all properties and copies of all {@link Shapes} from the source page.
    */
  def duplicate(xPage: XDrawPage): XDrawPage
}

object XDrawPageDuplicator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    duplicate: XDrawPage => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDrawPageDuplicator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), duplicate = js.Any.fromFunction1(duplicate), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDrawPageDuplicator]
  }
}

