package typings.activexLibreoffice.com_.sun.star.xml

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.document.XFilter
import typings.activexLibreoffice.com_.sun.star.document.XImporter
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an import filter for XML-based file formats.
  *
  * It is an extension of {@link com.sun.star.document.ImportFilter} and differs from it in that this filter additionally supports the {@link
  * com.sun.star.xml.sax.XDocumentHandler} interface.
  */
trait XMLImportFilter
  extends XImporter
     with XFilter
     with XInitialization
     with XNamed
     with XDocumentHandler

object XMLImportFilter {
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    cancel: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getName: () => String,
    ignorableWhitespace: String => Unit,
    initialize: SeqEquiv[_] => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    setName: String => Unit,
    setTargetDocument: XComponent => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): XMLImportFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), filter = js.Any.fromFunction1(filter), getName = js.Any.fromFunction0(getName), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), initialize = js.Any.fromFunction1(initialize), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setName = js.Any.fromFunction1(setName), setTargetDocument = js.Any.fromFunction1(setTargetDocument), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[XMLImportFilter]
  }
}

