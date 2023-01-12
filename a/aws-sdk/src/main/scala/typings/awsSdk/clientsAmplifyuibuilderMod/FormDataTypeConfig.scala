package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormDataTypeConfig extends StObject {
  
  /**
    * The data source type, either an Amplify DataStore model or a custom data type.
    */
  var dataSourceType: FormDataSourceType
  
  /**
    * The unique name of the data type you are using as the data source for the form.
    */
  var dataTypeName: String
}
object FormDataTypeConfig {
  
  inline def apply(dataSourceType: FormDataSourceType, dataTypeName: String): FormDataTypeConfig = {
    val __obj = js.Dynamic.literal(dataSourceType = dataSourceType.asInstanceOf[js.Any], dataTypeName = dataTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormDataTypeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormDataTypeConfig] (val x: Self) extends AnyVal {
    
    inline def setDataSourceType(value: FormDataSourceType): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
  }
}
