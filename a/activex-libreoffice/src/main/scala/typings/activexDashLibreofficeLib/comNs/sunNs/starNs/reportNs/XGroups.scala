package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface specifies the groups collections of the report definition.
  * @see XGroup
  * @see XReportDefinition
  */
trait XGroups
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  var ReportDefinition: XReportDefinition
  /** factory method for {@link XGroup} . */
  def createGroup(): XGroup
}

object XGroups {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ReportDefinition: XReportDefinition,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createGroup: js.Function0[XGroup],
    dispose: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    hasElements: js.Function0[scala.Boolean],
    insertByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    replaceByIndex: js.Function2[scala.Double, js.Any, scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XGroups = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, Parent = Parent, ReportDefinition = ReportDefinition, acquire = acquire, addContainerListener = addContainerListener, addEventListener = addEventListener, createGroup = createGroup, dispose = dispose, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, getParent = getParent, hasElements = hasElements, insertByIndex = insertByIndex, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex, removeContainerListener = removeContainerListener, removeEventListener = removeEventListener, replaceByIndex = replaceByIndex, setParent = setParent)
  
    __obj.asInstanceOf[XGroups]
  }
}

