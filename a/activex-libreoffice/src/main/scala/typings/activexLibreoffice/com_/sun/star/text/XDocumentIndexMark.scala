package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the mark of a document index entry.
  * @see DocumentIndexMark
  */
@js.native
trait XDocumentIndexMark extends XTextContent {
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  var MarkEntry: String = js.native
  /**
    * @returns the explicitly set string for the index mark.
    * @see setMarkEntry
    */
  def getMarkEntry(): String = js.native
  /**
    * sets an explicit string for this index mark to use in the index.
    *
    * If empty, the string of the {@link TextRange} to which the {@link TextContent} refers is used in the index.
    */
  def setMarkEntry(aIndexEntry: String): Unit = js.native
}

object XDocumentIndexMark {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    MarkEntry: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getMarkEntry: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setMarkEntry: String => Unit
  ): XDocumentIndexMark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], MarkEntry = MarkEntry.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getMarkEntry = js.Any.fromFunction0(getMarkEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setMarkEntry = js.Any.fromFunction1(setMarkEntry))
    __obj.asInstanceOf[XDocumentIndexMark]
  }
  @scala.inline
  implicit class XDocumentIndexMarkOps[Self <: XDocumentIndexMark] (val x: Self) extends AnyVal {
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
    def setMarkEntry(value: String): Self = this.set("MarkEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMarkEntry(value: () => String): Self = this.set("getMarkEntry", js.Any.fromFunction0(value))
    @scala.inline
    def setSetMarkEntry(value: String => Unit): Self = this.set("setMarkEntry", js.Any.fromFunction1(value))
  }
  
}

