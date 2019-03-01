package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of this service correspond to the similar named attributes and subelements of the XML element {@link chart2} :increment in the {@link
  * chart2} file format.
  */
trait LogicTargetModel extends js.Object {
  /**
    * not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.CoordinateSystem}
    */
  var CoordinateSystems: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** identifies an instance of this service within one chart document. */
  var ID: java.lang.String
  /**
    * identifies an instance of the service com::sun::star::chart2::LegendModel within one chart document. that instance is used to automatically calculate
    * missing properties
    */
  var LegendID: java.lang.String
  /**
    * MAYBEVOID, not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.LogicTargetModel}
    */
  var LogicTargetModels: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
}

object LogicTargetModel {
  @scala.inline
  def apply(
    CoordinateSystems: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    ID: java.lang.String,
    LegendID: java.lang.String,
    LogicTargetModels: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  ): LogicTargetModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CoordinateSystems")(CoordinateSystems)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("LegendID")(LegendID)
    __obj.updateDynamic("LogicTargetModels")(LogicTargetModels)
    __obj.asInstanceOf[LogicTargetModel]
  }
}

