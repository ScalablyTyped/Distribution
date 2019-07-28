package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSink
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * reflects the model data of the object that has all the information for a DataRenderer to create a visible data series in a chart.
  *
  * It combines one or more DataSequences which are interpreted by evaluating their role-string.
  * @see DataSequenceRole
  */
@js.native
trait DataSeries
  extends DataPointProperties
     with XDataSeries
     with XDataSink
     with XDataSource
     with XRegressionCurveContainer {
  /**
    * This property describes whether the series should be shown at the main value axis or at the secondary value axis. Having this property not set or
    * setting it to 0 means that this data series will be scaled at the primary y-axis ( of the coordinate system in which this series is hosted ).
    *
    * Setting this property to 1 means that this series should be scaled at the secondary y-axis. If there is no secondary axis the main axis should be used
    * for scaling instead.
    *
    * If you want to scale a series at a different x or z axis you need to create an additional coordinate system and host this series there.
    */
  var AttachedAxisIndex: Double = js.native
  /**
    * This service will be used to render this data series.
    *
    * This service name can be used to determine which {@link DataSeries} are of the same type.
    *
    * The result of the DataSeries::DataSequenceRoles depends on the renderer service set here.
    *
    * a sequence of indexes denoting which data points have set properties that differ from the default.
    *
    * The default values are determined by the properties set at the {@link DataPointProperties} of the data series.
    *
    * If the sequence is empty, that means that all data points look alike. They are formatted using the property values set in the data series.
    *
    * The indexes in this sequence match the indexes used by the XIndexContainer.
    *
    * This property is especially useful for large data series with only some formatted data points, because you do not have to iterate over all elements.
    */
  var AttributedDataPoints: SafeArray[Double] = js.native
  /** indicates whether this series should be stacked with respect to the previous series. */
  var StackingDirection: typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.StackingDirection = js.native
  /** If `TRUE` , the data points of this series get different colors by default, like in a pie chart. */
  var VaryColorsByPoint: Boolean = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

