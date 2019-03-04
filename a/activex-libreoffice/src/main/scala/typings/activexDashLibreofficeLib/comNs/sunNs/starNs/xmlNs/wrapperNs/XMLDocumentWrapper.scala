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
    acquire: js.Function0[scala.Unit],
    clearUselessData: js.Function3[
      XXMLElementWrapper, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XXMLElementWrapper], 
      XXMLElementWrapper, 
      scala.Unit
    ],
    collapse: js.Function1[XXMLElementWrapper, scala.Unit],
    generateSAXEvents: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      XXMLElementWrapper, 
      XXMLElementWrapper, 
      scala.Unit
    ],
    getCurrentElement: js.Function0[XXMLElementWrapper],
    getNodeName: js.Function1[XXMLElementWrapper, java.lang.String],
    getTree: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      scala.Unit
    ],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isCurrent: js.Function1[XXMLElementWrapper, scala.Boolean],
    isCurrentElementEmpty: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rebuildIDLink: js.Function1[XXMLElementWrapper, scala.Unit],
    release: js.Function0[scala.Unit],
    removeCurrentElement: js.Function0[scala.Unit],
    setCurrentElement: js.Function1[XXMLElementWrapper, scala.Unit]
  ): XMLDocumentWrapper = {
    val __obj = js.Dynamic.literal(CurrentElement = CurrentElement, acquire = acquire, clearUselessData = clearUselessData, collapse = collapse, generateSAXEvents = generateSAXEvents, getCurrentElement = getCurrentElement, getNodeName = getNodeName, getTree = getTree, initialize = initialize, isCurrent = isCurrent, isCurrentElementEmpty = isCurrentElementEmpty, queryInterface = queryInterface, rebuildIDLink = rebuildIDLink, release = release, removeCurrentElement = removeCurrentElement, setCurrentElement = setCurrentElement)
  
    __obj.asInstanceOf[XMLDocumentWrapper]
  }
}

