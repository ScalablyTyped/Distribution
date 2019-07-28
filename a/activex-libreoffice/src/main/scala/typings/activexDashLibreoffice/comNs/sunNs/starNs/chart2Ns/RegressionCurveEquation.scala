package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegressionCurveEquation
  extends PropertySet
     with FillProperties
     with LineProperties
     with CharacterProperties {
  var NumberFormat: Double = js.native
  var ReferencePageSize: Size = js.native
  var RelativePosition: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.RelativePosition = js.native
  var ShowCorrelationCoefficient: Boolean = js.native
  var ShowEquation: Boolean = js.native
  var XName: String = js.native
  var YName: String = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

