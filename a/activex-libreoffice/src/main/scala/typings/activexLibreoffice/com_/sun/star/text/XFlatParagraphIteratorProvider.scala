package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
@js.native
trait XFlatParagraphIteratorProvider extends XInterface {
  /**
    * get {@link XFlatParagraphIterator}
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param bAutomatic Automatic or interactive checking.
    * @returns the iterator.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getFlatParagraphIterator(nType: Double, bAutomatic: Boolean): XFlatParagraphIterator = js.native
}

object XFlatParagraphIteratorProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getFlatParagraphIterator: (Double, Boolean) => XFlatParagraphIterator,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlatParagraphIteratorProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFlatParagraphIterator = js.Any.fromFunction2(getFlatParagraphIterator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlatParagraphIteratorProvider]
  }
  @scala.inline
  implicit class XFlatParagraphIteratorProviderOps[Self <: XFlatParagraphIteratorProvider] (val x: Self) extends AnyVal {
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
    def setGetFlatParagraphIterator(value: (Double, Boolean) => XFlatParagraphIterator): Self = this.set("getFlatParagraphIterator", js.Any.fromFunction2(value))
  }
  
}

