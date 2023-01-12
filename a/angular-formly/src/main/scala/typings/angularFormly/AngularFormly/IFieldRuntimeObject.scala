package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldRuntimeObject
  extends StObject
     with IFieldObject {
  
  var model: StringDictionary[Any]
}
object IFieldRuntimeObject {
  
  inline def apply(model: StringDictionary[Any]): IFieldRuntimeObject = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldRuntimeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldRuntimeObject] (val x: Self) extends AnyVal {
    
    inline def setModel(value: StringDictionary[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
