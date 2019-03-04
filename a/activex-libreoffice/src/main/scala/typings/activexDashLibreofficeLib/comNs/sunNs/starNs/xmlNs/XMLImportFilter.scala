package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.ImportFilter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler

object XMLImportFilter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    getName: js.Function0[java.lang.String],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setTargetDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList, 
      scala.Unit
    ]
  ): XMLImportFilter = {
    val __obj = js.Dynamic.literal(Name = Name, acquire = acquire, cancel = cancel, characters = characters, endDocument = endDocument, endElement = endElement, filter = filter, getName = getName, ignorableWhitespace = ignorableWhitespace, initialize = initialize, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, setName = setName, setTargetDocument = setTargetDocument, startDocument = startDocument, startElement = startElement)
  
    __obj.asInstanceOf[XMLImportFilter]
  }
}

