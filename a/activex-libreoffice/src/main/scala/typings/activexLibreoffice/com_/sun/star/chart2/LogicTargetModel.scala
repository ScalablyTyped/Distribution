package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of this service correspond to the similar named attributes and subelements of the XML element {@link chart2} :increment in the {@link
  * chart2} file format.
  */
trait LogicTargetModel extends StObject {
  
  /**
    * not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.CoordinateSystem}
    */
  var CoordinateSystems: SafeArray[XPropertySet]
  
  /** identifies an instance of this service within one chart document. */
  var ID: String
  
  /**
    * identifies an instance of the service com::sun::star::chart2::LegendModel within one chart document. that instance is used to automatically calculate
    * missing properties
    */
  var LegendID: String
  
  /**
    * MAYBEVOID, not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.LogicTargetModel}
    */
  var LogicTargetModels: SafeArray[XPropertySet]
}
object LogicTargetModel {
  
  inline def apply(
    CoordinateSystems: SafeArray[XPropertySet],
    ID: String,
    LegendID: String,
    LogicTargetModels: SafeArray[XPropertySet]
  ): LogicTargetModel = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LegendID = LegendID.asInstanceOf[js.Any], LogicTargetModels = LogicTargetModels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicTargetModel]
  }
  
  extension [Self <: LogicTargetModel](x: Self) {
    
    inline def setCoordinateSystems(value: SafeArray[XPropertySet]): Self = StObject.set(x, "CoordinateSystems", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLegendID(value: String): Self = StObject.set(x, "LegendID", value.asInstanceOf[js.Any])
    
    inline def setLogicTargetModels(value: SafeArray[XPropertySet]): Self = StObject.set(x, "LogicTargetModels", value.asInstanceOf[js.Any])
  }
}
