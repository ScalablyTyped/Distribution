package typings.apolloProtobufjs.mod.common

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Struct message. */
trait IStruct extends StObject {
  
  var fields: js.UndefOr[StringDictionary[js.UndefOr[IValue]]] = js.undefined
}
object IStruct {
  
  @scala.inline
  def apply(): IStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStruct]
  }
  
  @scala.inline
  implicit class IStructMutableBuilder[Self <: IStruct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[js.UndefOr[IValue]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
