package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomActionFilterOperation extends StObject {
  
  /**
    * The configuration that chooses the fields to be filtered.
    */
  var SelectedFieldsConfiguration: FilterOperationSelectedFieldsConfiguration
  
  /**
    * The configuration that chooses the target visuals to be filtered.
    */
  var TargetVisualsConfiguration: FilterOperationTargetVisualsConfiguration
}
object CustomActionFilterOperation {
  
  inline def apply(
    SelectedFieldsConfiguration: FilterOperationSelectedFieldsConfiguration,
    TargetVisualsConfiguration: FilterOperationTargetVisualsConfiguration
  ): CustomActionFilterOperation = {
    val __obj = js.Dynamic.literal(SelectedFieldsConfiguration = SelectedFieldsConfiguration.asInstanceOf[js.Any], TargetVisualsConfiguration = TargetVisualsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomActionFilterOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomActionFilterOperation] (val x: Self) extends AnyVal {
    
    inline def setSelectedFieldsConfiguration(value: FilterOperationSelectedFieldsConfiguration): Self = StObject.set(x, "SelectedFieldsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTargetVisualsConfiguration(value: FilterOperationTargetVisualsConfiguration): Self = StObject.set(x, "TargetVisualsConfiguration", value.asInstanceOf[js.Any])
  }
}
