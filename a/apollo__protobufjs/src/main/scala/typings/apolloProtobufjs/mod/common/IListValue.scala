package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.ListValue message. */
trait IListValue extends StObject {
  
  var values: js.UndefOr[js.Array[IValue]] = js.undefined
}
object IListValue {
  
  @scala.inline
  def apply(): IListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListValue]
  }
  
  @scala.inline
  implicit class IListValueMutableBuilder[Self <: IListValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[IValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: IValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
