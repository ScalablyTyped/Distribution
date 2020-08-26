package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables a text object to copy attributed text from another text object. */
@js.native
trait XTextCopy extends XInterface {
  /**
    * copies the content from another text object.
    * @param xSource specifies the source text object.
    */
  def copyText(xSource: XTextCopy): Unit = js.native
}

object XTextCopy {
  @scala.inline
  def apply(
    acquire: () => Unit,
    copyText: XTextCopy => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextCopy = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copyText = js.Any.fromFunction1(copyText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextCopy]
  }
  @scala.inline
  implicit class XTextCopyOps[Self <: XTextCopy] (val x: Self) extends AnyVal {
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
    def setCopyText(value: XTextCopy => Unit): Self = this.set("copyText", js.Any.fromFunction1(value))
  }
  
}

