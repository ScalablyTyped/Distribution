package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineIndexFieldResponse extends StObject {
  
  var IndexField: IndexFieldStatus
}
object DefineIndexFieldResponse {
  
  inline def apply(IndexField: IndexFieldStatus): DefineIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexFieldResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineIndexFieldResponse] (val x: Self) extends AnyVal {
    
    inline def setIndexField(value: IndexFieldStatus): Self = StObject.set(x, "IndexField", value.asInstanceOf[js.Any])
  }
}
