package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of this service correspond to the similar named attributes and subelements of the XML element {@link chart2} :increment in the {@link
  * chart2} file format.
  */
@js.native
trait LogicTargetModel extends js.Object {
  /**
    * not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.CoordinateSystem}
    */
  var CoordinateSystems: SafeArray[XPropertySet] = js.native
  /** identifies an instance of this service within one chart document. */
  var ID: String = js.native
  /**
    * identifies an instance of the service com::sun::star::chart2::LegendModel within one chart document. that instance is used to automatically calculate
    * missing properties
    */
  var LegendID: String = js.native
  /**
    * MAYBEVOID, not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.LogicTargetModel}
    */
  var LogicTargetModels: SafeArray[XPropertySet] = js.native
}

object LogicTargetModel {
  @scala.inline
  def apply(
    CoordinateSystems: SafeArray[XPropertySet],
    ID: String,
    LegendID: String,
    LogicTargetModels: SafeArray[XPropertySet]
  ): LogicTargetModel = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LegendID = LegendID.asInstanceOf[js.Any], LogicTargetModels = LogicTargetModels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicTargetModel]
  }
  @scala.inline
  implicit class LogicTargetModelOps[Self <: LogicTargetModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinateSystems(value: SafeArray[XPropertySet]): Self = this.set("CoordinateSystems", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendID(value: String): Self = this.set("LegendID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicTargetModels(value: SafeArray[XPropertySet]): Self = this.set("LogicTargetModels", value.asInstanceOf[js.Any])
  }
  
}

