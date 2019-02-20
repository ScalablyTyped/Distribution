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

