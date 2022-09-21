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
  
  inline def apply(
    model: StringDictionary[Any],
    value: js.UndefOr[js.Function0[Any]] & (js.UndefOr[js.Function1[/* val */ Any, Unit]])
  ): IFieldRuntimeObject = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldRuntimeObject]
  }
  
  extension [Self <: IFieldRuntimeObject](x: Self) {
    
    inline def setModel(value: StringDictionary[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
