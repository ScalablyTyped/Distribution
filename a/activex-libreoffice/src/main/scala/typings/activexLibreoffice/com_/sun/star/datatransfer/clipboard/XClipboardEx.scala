package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extended clipboard interface.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardEx extends XClipboard {
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  val RenderingCapabilities: Double
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  def getRenderingCapabilities(): Double
}

object XClipboardEx {
  @scala.inline
  def apply(
    Contents: XTransferable,
    Name: String,
    RenderingCapabilities: Double,
    acquire: () => Unit,
    getContents: () => XTransferable,
    getName: () => String,
    getRenderingCapabilities: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContents: (XTransferable, XClipboardOwner) => Unit
  ): XClipboardEx = {
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContents = js.Any.fromFunction2(setContents))
    __obj.asInstanceOf[XClipboardEx]
  }
}

