package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XStyleSupplier extends XInterface {
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  var Style: XStyle = js.native
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  def getStyle(): XStyle = js.native
  /** @param xStyle If you want to remove an existing style, you can set an empty (null) object. Otherwise, the object given must support the service Property */
  def setStyle(xStyle: XStyle): Unit = js.native
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
  @scala.inline
  implicit class XStyleSupplierOps[Self <: XStyleSupplier] (val x: Self) extends AnyVal {
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
    def setStyle(value: XStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStyle(value: () => XStyle): Self = this.set("getStyle", js.Any.fromFunction0(value))
    @scala.inline
    def setSetStyle(value: XStyle => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
  }
  
}

