package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Struct message. */
trait IStruct extends StObject {
  
  var fields: js.UndefOr[StringDictionary[IValue]] = js.undefined
}
object IStruct {
  
  inline def apply(): IStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStruct]
  }
  
  extension [Self <: IStruct](x: Self) {
    
    inline def setFields(value: StringDictionary[IValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
