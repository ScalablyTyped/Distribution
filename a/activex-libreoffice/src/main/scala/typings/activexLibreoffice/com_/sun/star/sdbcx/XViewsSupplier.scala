package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides for access to a container of views, typically used for a database definition object. */
@js.native
trait XViewsSupplier extends XInterface {
  /**
    * returns the container of views.
    * @returns the views
    */
  val Views: XNameAccess = js.native
  /**
    * returns the container of views.
    * @returns the views
    */
  def getViews(): XNameAccess = js.native
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
  @scala.inline
  implicit class XViewsSupplierOps[Self <: XViewsSupplier] (val x: Self) extends AnyVal {
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
    def setViews(value: XNameAccess): Self = this.set("Views", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetViews(value: () => XNameAccess): Self = this.set("getViews", js.Any.fromFunction0(value))
  }
  
}

