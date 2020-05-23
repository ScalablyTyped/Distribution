package typings.activexLibreoffice.com_.sun.star.xml.dom.views

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentView extends XInterface {
  val DefaultView: XAbstractView
  def getDefaultView(): XAbstractView
}

object XDocumentView {
  @scala.inline
  def apply(
    DefaultView: XAbstractView,
    acquire: () => Unit,
    getDefaultView: () => XAbstractView,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentView = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentView]
  }
}

