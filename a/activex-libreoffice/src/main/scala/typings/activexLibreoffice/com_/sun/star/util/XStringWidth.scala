package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that encapsulates the abstract notion of string width.
  * @see XStringAbbreviation
  */
@js.native
trait XStringWidth extends XInterface {
  /**
    * compute the width of a given string.
    *
    * Depending on the implementation of this interface, the width of a string can be rather different things, like the number of characters in the string,
    * or the width in pixel when displayed with a specific font.
    * @param aString The string that is to be measured.
    * @returns the string's width.
    */
  def queryStringWidth(aString: String): Double = js.native
}

object XStringWidth {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    queryStringWidth: String => Double,
    release: () => Unit
  ): XStringWidth = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), queryStringWidth = js.Any.fromFunction1(queryStringWidth), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStringWidth]
  }
  @scala.inline
  implicit class XStringWidthOps[Self <: XStringWidth] (val x: Self) extends AnyVal {
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
    def setQueryStringWidth(value: String => Double): Self = this.set("queryStringWidth", js.Any.fromFunction1(value))
  }
  
}

