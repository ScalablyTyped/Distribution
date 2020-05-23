package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal interface to update the used css::frame::XModel
  * @since LibreOffice 5.1
  */
trait XUpdateModel extends XInterface {
  def updateModel(xModel: XModel): Unit
}

object XUpdateModel {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateModel: XModel => Unit
  ): XUpdateModel = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateModel = js.Any.fromFunction1(updateModel))
    __obj.asInstanceOf[XUpdateModel]
  }
}

