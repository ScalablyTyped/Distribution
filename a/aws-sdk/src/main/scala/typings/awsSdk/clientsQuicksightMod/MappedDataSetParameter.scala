package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappedDataSetParameter extends StObject {
  
  /**
    * A unique name that identifies a dataset within the analysis or dashboard.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
  
  /**
    * The name of the dataset parameter.
    */
  var DataSetParameterName: ParameterName
}
object MappedDataSetParameter {
  
  inline def apply(DataSetIdentifier: DataSetIdentifier, DataSetParameterName: ParameterName): MappedDataSetParameter = {
    val __obj = js.Dynamic.literal(DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any], DataSetParameterName = DataSetParameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedDataSetParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappedDataSetParameter] (val x: Self) extends AnyVal {
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDataSetParameterName(value: ParameterName): Self = StObject.set(x, "DataSetParameterName", value.asInstanceOf[js.Any])
  }
}
