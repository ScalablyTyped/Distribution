package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XStyleSupplier extends XInterface {
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  var Style: XStyle
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  def getStyle(): XStyle
  /** @param xStyle If you want to remove an existing style, you can set an empty (null) object. Otherwise, the object given must support the service Property */
  def setStyle(xStyle: XStyle): Unit
}

object XStyleSupplier {
  @scala.inline
  def apply(
    Style: XStyle,
    acquire: () => Unit,
    getStyle: () => XStyle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setStyle: XStyle => Unit
  ): XStyleSupplier = {
    val __obj = js.Dynamic.literal(Style = Style.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyle = js.Any.fromFunction0(getStyle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[XStyleSupplier]
  }
}

