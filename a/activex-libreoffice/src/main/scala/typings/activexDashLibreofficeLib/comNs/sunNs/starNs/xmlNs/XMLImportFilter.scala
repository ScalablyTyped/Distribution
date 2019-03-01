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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("endDocument")(endDocument)
    __obj.updateDynamic("endElement")(endElement)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("ignorableWhitespace")(ignorableWhitespace)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("processingInstruction")(processingInstruction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDocumentLocator")(setDocumentLocator)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setTargetDocument")(setTargetDocument)
    __obj.updateDynamic("startDocument")(startDocument)
    __obj.updateDynamic("startElement")(startElement)
    __obj.asInstanceOf[XMLImportFilter]
  }
}

