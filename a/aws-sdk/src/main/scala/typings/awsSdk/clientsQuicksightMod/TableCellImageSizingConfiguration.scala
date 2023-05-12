package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCellImageSizingConfiguration extends StObject {
  
  /**
    * The cell scaling configuration of the sizing options for the table image configuration.
    */
  var TableCellImageScalingConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TableCellImageScalingConfiguration] = js.undefined
}
object TableCellImageSizingConfiguration {
  
  inline def apply(): TableCellImageSizingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellImageSizingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCellImageSizingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTableCellImageScalingConfiguration(value: TableCellImageScalingConfiguration): Self = StObject.set(x, "TableCellImageScalingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTableCellImageScalingConfigurationUndefined: Self = StObject.set(x, "TableCellImageScalingConfiguration", js.undefined)
  }
}
