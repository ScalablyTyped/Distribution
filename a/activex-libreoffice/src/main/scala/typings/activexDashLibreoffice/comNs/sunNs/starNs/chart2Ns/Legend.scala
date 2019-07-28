package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.ChartLegendExpansion
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.FillProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.LineProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a legend for a {@link Diagram} . */
@js.native
trait Legend
  extends PropertySet
     with FillProperties
     with LineProperties {
  /** Provides an automated position */
  var AnchorPosition: LegendPosition = js.native
  /**
    * Determines how the aspect ratio of the legend should roughly be.
    *
    * Set the Expansion to {@link com.sun.star.chart.HIGH} for a legend that is positioned on the right or left hand side. Use {@link
    * com.sun.star.chart.WIDE} for a legend that is positioned on top or the bottom.
    */
  var Expansion: ChartLegendExpansion = js.native
  /**
    * contains the size of the page at the time when properties were set (e.g. the CharHeight).
    *
    * This way it is possible to resize objects (like text) in the view without modifying the model.
    */
  var ReferencePageSize: Size = js.native
  /**
    * The position is as a relative position on the page.
    *
    * If a relative position is given the legend is not automatically placed, but instead is placed relative on the page.
    *
    * If `VOID` , the legend position is solely determined by the {@link AnchorPosition} .
    */
  var RelativePosition: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.RelativePosition = js.native
  /** Determines, whether the legend should be rendered by the view. */
  var Show: Boolean = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

