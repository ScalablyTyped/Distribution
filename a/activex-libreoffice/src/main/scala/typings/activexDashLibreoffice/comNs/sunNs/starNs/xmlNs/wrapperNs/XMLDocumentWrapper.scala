package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.wrapperNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLDocumentWrapper} */
trait XMLDocumentWrapper
  extends XXMLDocumentWrapper
     with XInitialization

object XMLDocumentWrapper {
  @scala.inline
  def apply(
    CurrentElement: XXMLElementWrapper,
    acquire: () => Unit,
    clearUselessData: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Unit,
    collapse: XXMLElementWrapper => Unit,
    generateSAXEvents: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Unit,
    getCurrentElement: () => XXMLElementWrapper,
    getNodeName: XXMLElementWrapper => String,
    getTree: XDocumentHandler => Unit,
    initialize: SeqEquiv[_] => Unit,
    isCurrent: XXMLElementWrapper => Boolean,
    isCurrentElementEmpty: () => Boolean,
    queryInterface: `type` => js.Any,
    rebuildIDLink: XXMLElementWrapper => Unit,
    release: () => Unit,
    removeCurrentElement: () => Unit,
    setCurrentElement: XXMLElementWrapper => Unit
  ): XMLDocumentWrapper = {
    val __obj = js.Dynamic.literal(CurrentElement = CurrentElement, acquire = js.Any.fromFunction0(acquire), clearUselessData = js.Any.fromFunction3(clearUselessData), collapse = js.Any.fromFunction1(collapse), generateSAXEvents = js.Any.fromFunction4(generateSAXEvents), getCurrentElement = js.Any.fromFunction0(getCurrentElement), getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1(getTree), initialize = js.Any.fromFunction1(initialize), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = js.Any.fromFunction0(isCurrentElementEmpty), queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1(rebuildIDLink), release = js.Any.fromFunction0(release), removeCurrentElement = js.Any.fromFunction0(removeCurrentElement), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
  
    __obj.asInstanceOf[XMLDocumentWrapper]
  }
}

