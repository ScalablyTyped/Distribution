package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLine extends StObject {
  
  /**
    * The data configuration of the reference line.
    */
  var DataConfiguration: ReferenceLineDataConfiguration
  
  /**
    * The label configuration of the reference line.
    */
  var LabelConfiguration: js.UndefOr[ReferenceLineLabelConfiguration] = js.undefined
  
  /**
    * The status of the reference line. Choose one of the following options:    ENABLE     DISABLE   
    */
  var Status: js.UndefOr[WidgetStatus] = js.undefined
  
  /**
    * The style configuration of the reference line.
    */
  var StyleConfiguration: js.UndefOr[ReferenceLineStyleConfiguration] = js.undefined
}
object ReferenceLine {
  
  inline def apply(DataConfiguration: ReferenceLineDataConfiguration): ReferenceLine = {
    val __obj = js.Dynamic.literal(DataConfiguration = DataConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLine] (val x: Self) extends AnyVal {
    
    inline def setDataConfiguration(value: ReferenceLineDataConfiguration): Self = StObject.set(x, "DataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelConfiguration(value: ReferenceLineLabelConfiguration): Self = StObject.set(x, "LabelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLabelConfigurationUndefined: Self = StObject.set(x, "LabelConfiguration", js.undefined)
    
    inline def setStatus(value: WidgetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStyleConfiguration(value: ReferenceLineStyleConfiguration): Self = StObject.set(x, "StyleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStyleConfigurationUndefined: Self = StObject.set(x, "StyleConfiguration", js.undefined)
  }
}
