package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IField extends StObject {
  
  /** Field name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Field returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}
object IField {
  
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  
  @scala.inline
  implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
