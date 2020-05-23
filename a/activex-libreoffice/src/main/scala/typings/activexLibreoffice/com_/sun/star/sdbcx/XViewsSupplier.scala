package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of views, typically used for a database definition object. */
trait XViewsSupplier extends XInterface {
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: XNameAccess
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): XNameAccess
}

object XViewsSupplier {
  @scala.inline
  def apply(
    Views: XNameAccess,
    acquire: () => Unit,
    getViews: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XViewsSupplier = {
    val __obj = js.Dynamic.literal(Views = Views.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XViewsSupplier]
  }
}

