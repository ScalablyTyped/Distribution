package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XXMLOasisBasicImporter
  extends StObject
     with XImporter
     with XDocumentHandler
object XXMLOasisBasicImporter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    setTargetDocument: XComponent => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): XXMLOasisBasicImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setTargetDocument = js.Any.fromFunction1(setTargetDocument), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[XXMLOasisBasicImporter]
  }
}
