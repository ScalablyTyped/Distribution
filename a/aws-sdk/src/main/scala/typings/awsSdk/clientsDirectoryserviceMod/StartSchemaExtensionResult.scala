package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSchemaExtensionResult extends StObject {
  
  /**
    * The identifier of the schema extension that will be applied.
    */
  var SchemaExtensionId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SchemaExtensionId] = js.undefined
}
object StartSchemaExtensionResult {
  
  inline def apply(): StartSchemaExtensionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSchemaExtensionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSchemaExtensionResult] (val x: Self) extends AnyVal {
    
    inline def setSchemaExtensionId(value: SchemaExtensionId): Self = StObject.set(x, "SchemaExtensionId", value.asInstanceOf[js.Any])
    
    inline def setSchemaExtensionIdUndefined: Self = StObject.set(x, "SchemaExtensionId", js.undefined)
  }
}
