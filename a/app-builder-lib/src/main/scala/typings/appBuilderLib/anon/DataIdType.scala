package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIdType extends StObject {
  
  var data: IdType
}
object DataIdType {
  
  inline def apply(data: IdType): DataIdType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIdType]
  }
  
  extension [Self <: DataIdType](x: Self) {
    
    inline def setData(value: IdType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
