package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerDeInfo extends StObject {
  
  /**
    * Name of the SerDe.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * These key-value pairs define initialization parameters for the SerDe.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.undefined
  
  /**
    * Usually the class that implements the SerDe. An example is org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var SerializationLibrary: js.UndefOr[NameString] = js.undefined
}
object SerDeInfo {
  
  inline def apply(): SerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerDeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerDeInfo] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setSerializationLibrary(value: NameString): Self = StObject.set(x, "SerializationLibrary", value.asInstanceOf[js.Any])
    
    inline def setSerializationLibraryUndefined: Self = StObject.set(x, "SerializationLibrary", js.undefined)
  }
}
