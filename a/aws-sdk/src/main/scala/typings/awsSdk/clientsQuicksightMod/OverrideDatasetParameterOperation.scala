package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideDatasetParameterOperation extends StObject {
  
  /**
    * The new default values for the parameter.
    */
  var NewDefaultValues: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NewDefaultValues] = js.undefined
  
  /**
    * The new name for the parameter.
    */
  var NewParameterName: js.UndefOr[DatasetParameterName] = js.undefined
  
  /**
    * The name of the parameter to be overridden with different values.
    */
  var ParameterName: DatasetParameterName
}
object OverrideDatasetParameterOperation {
  
  inline def apply(ParameterName: DatasetParameterName): OverrideDatasetParameterOperation = {
    val __obj = js.Dynamic.literal(ParameterName = ParameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideDatasetParameterOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverrideDatasetParameterOperation] (val x: Self) extends AnyVal {
    
    inline def setNewDefaultValues(value: NewDefaultValues): Self = StObject.set(x, "NewDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setNewDefaultValuesUndefined: Self = StObject.set(x, "NewDefaultValues", js.undefined)
    
    inline def setNewParameterName(value: DatasetParameterName): Self = StObject.set(x, "NewParameterName", value.asInstanceOf[js.Any])
    
    inline def setNewParameterNameUndefined: Self = StObject.set(x, "NewParameterName", js.undefined)
    
    inline def setParameterName(value: DatasetParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
  }
}
