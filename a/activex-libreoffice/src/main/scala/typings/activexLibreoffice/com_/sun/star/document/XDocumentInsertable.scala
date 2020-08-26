package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to import a document from a given URL into this document. */
@js.native
trait XDocumentInsertable extends XInterface {
  /** inserts the document that is specified by the URL. */
  def insertDocumentFromURL(aURL: String, aOptions: SeqEquiv[PropertyValue]): Unit = js.native
}

object XDocumentInsertable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    insertDocumentFromURL: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentInsertable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), insertDocumentFromURL = js.Any.fromFunction2(insertDocumentFromURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentInsertable]
  }
  @scala.inline
  implicit class XDocumentInsertableOps[Self <: XDocumentInsertable] (val x: Self) extends AnyVal {
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
    def setInsertDocumentFromURL(value: (String, SeqEquiv[PropertyValue]) => Unit): Self = this.set("insertDocumentFromURL", js.Any.fromFunction2(value))
  }
  
}

