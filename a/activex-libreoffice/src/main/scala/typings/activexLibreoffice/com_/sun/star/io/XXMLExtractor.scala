package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers the capability to extract the XML document stream from a document storage. */
@js.native
trait XXMLExtractor extends XInterface {
  /**
    * extracts the XML stream from the document storage.
    * @returns the extracted XML stream.
    */
  def extract(aStream: XInputStream): XInputStream = js.native
}

object XXMLExtractor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    extract: XInputStream => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXMLExtractor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), extract = js.Any.fromFunction1(extract), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXMLExtractor]
  }
  @scala.inline
  implicit class XXMLExtractorOps[Self <: XXMLExtractor] (val x: Self) extends AnyVal {
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
    def setExtract(value: XInputStream => XInputStream): Self = this.set("extract", js.Any.fromFunction1(value))
  }
  
}

