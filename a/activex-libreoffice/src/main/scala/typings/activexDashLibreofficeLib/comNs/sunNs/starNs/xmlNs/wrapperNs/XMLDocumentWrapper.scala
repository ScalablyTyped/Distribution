package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLDocumentWrapper} */
trait XMLDocumentWrapper
  extends XXMLDocumentWrapper
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLDocumentWrapper {
  @scala.inline
  def apply(
    CurrentElement: XXMLElementWrapper,
    acquire: () => scala.Unit,
    clearUselessData: (XXMLElementWrapper, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => scala.Unit,
    collapse: XXMLElementWrapper => scala.Unit,
    generateSAXEvents: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => scala.Unit,
    getCurrentElement: () => XXMLElementWrapper,
    getNodeName: XXMLElementWrapper => java.lang.String,
    getTree: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isCurrent: XXMLElementWrapper => scala.Boolean,
    isCurrentElementEmpty: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    rebuildIDLink: XXMLElementWrapper => scala.Unit,
    release: () => scala.Unit,
    removeCurrentElement: () => scala.Unit,
    setCurrentElement: XXMLElementWrapper => scala.Unit
  ): XMLDocumentWrapper = {
    val __obj = js.Dynamic.literal(CurrentElement = CurrentElement, acquire = js.Any.fromFunction0(acquire), clearUselessData = js.Any.fromFunction3(clearUselessData), collapse = js.Any.fromFunction1(collapse), generateSAXEvents = js.Any.fromFunction4(generateSAXEvents), getCurrentElement = js.Any.fromFunction0(getCurrentElement), getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1(getTree), initialize = js.Any.fromFunction1(initialize), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = js.Any.fromFunction0(isCurrentElementEmpty), queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1(rebuildIDLink), release = js.Any.fromFunction0(release), removeCurrentElement = js.Any.fromFunction0(removeCurrentElement), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
  
    __obj.asInstanceOf[XMLDocumentWrapper]
  }
}

