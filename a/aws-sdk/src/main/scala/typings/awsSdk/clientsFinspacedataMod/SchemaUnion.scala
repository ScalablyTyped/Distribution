package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnion extends StObject {
  
  /**
    * The configuration for a schema on a tabular Dataset.
    */
  var tabularSchemaConfig: js.UndefOr[SchemaDefinition] = js.undefined
}
object SchemaUnion {
  
  inline def apply(): SchemaUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaUnion] (val x: Self) extends AnyVal {
    
    inline def setTabularSchemaConfig(value: SchemaDefinition): Self = StObject.set(x, "tabularSchemaConfig", value.asInstanceOf[js.Any])
    
    inline def setTabularSchemaConfigUndefined: Self = StObject.set(x, "tabularSchemaConfig", js.undefined)
  }
}
