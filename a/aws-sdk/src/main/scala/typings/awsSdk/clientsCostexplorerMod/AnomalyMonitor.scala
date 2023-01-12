package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnomalyMonitor extends StObject {
  
  /**
    * The date when the monitor was created. 
    */
  var CreationDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The value for evaluated dimensions. 
    */
  var DimensionalValueCount: js.UndefOr[NonNegativeInteger] = js.undefined
  
  /**
    * The date when the monitor last evaluated for anomalies. 
    */
  var LastEvaluatedDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The date when the monitor was last updated. 
    */
  var LastUpdatedDate: js.UndefOr[YearMonthDay] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) value. 
    */
  var MonitorArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The dimensions to evaluate. 
    */
  var MonitorDimension: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.MonitorDimension] = js.undefined
  
  /**
    * The name of the monitor. 
    */
  var MonitorName: GenericString
  
  var MonitorSpecification: js.UndefOr[Expression] = js.undefined
  
  /**
    * The possible type values. 
    */
  var MonitorType: typings.awsSdk.clientsCostexplorerMod.MonitorType
}
object AnomalyMonitor {
  
  inline def apply(MonitorName: GenericString, MonitorType: MonitorType): AnomalyMonitor = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any], MonitorType = MonitorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyMonitor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnomalyMonitor] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: YearMonthDay): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDimensionalValueCount(value: NonNegativeInteger): Self = StObject.set(x, "DimensionalValueCount", value.asInstanceOf[js.Any])
    
    inline def setDimensionalValueCountUndefined: Self = StObject.set(x, "DimensionalValueCount", js.undefined)
    
    inline def setLastEvaluatedDate(value: YearMonthDay): Self = StObject.set(x, "LastEvaluatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedDateUndefined: Self = StObject.set(x, "LastEvaluatedDate", js.undefined)
    
    inline def setLastUpdatedDate(value: YearMonthDay): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    inline def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setMonitorDimension(value: MonitorDimension): Self = StObject.set(x, "MonitorDimension", value.asInstanceOf[js.Any])
    
    inline def setMonitorDimensionUndefined: Self = StObject.set(x, "MonitorDimension", js.undefined)
    
    inline def setMonitorName(value: GenericString): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setMonitorSpecification(value: Expression): Self = StObject.set(x, "MonitorSpecification", value.asInstanceOf[js.Any])
    
    inline def setMonitorSpecificationUndefined: Self = StObject.set(x, "MonitorSpecification", js.undefined)
    
    inline def setMonitorType(value: MonitorType): Self = StObject.set(x, "MonitorType", value.asInstanceOf[js.Any])
  }
}
