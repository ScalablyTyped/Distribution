package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSchemaRequest extends StObject {
  
  /**
    * The name that is associated with the schema. This is unique to each account and in each region.
    */
  var Name: SchemaName
}
object CreateSchemaRequest {
  
  inline def apply(Name: SchemaName): CreateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSchemaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSchemaRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: SchemaName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
