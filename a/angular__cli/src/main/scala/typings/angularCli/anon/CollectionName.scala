package typings.angularCli.anon

import typings.angularCli.commandModuleMod.OtherOptions
import typings.angularCli.schematicsCommandModuleMod.SchematicsExecutionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionName extends StObject {
  
  var collectionName: String
  
  var executionOptions: SchematicsExecutionOptions
  
  var schematicName: String
  
  var schematicOptions: OtherOptions
}
object CollectionName {
  
  inline def apply(
    collectionName: String,
    executionOptions: SchematicsExecutionOptions,
    schematicName: String,
    schematicOptions: OtherOptions
  ): CollectionName = {
    val __obj = js.Dynamic.literal(collectionName = collectionName.asInstanceOf[js.Any], executionOptions = executionOptions.asInstanceOf[js.Any], schematicName = schematicName.asInstanceOf[js.Any], schematicOptions = schematicOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionName]
  }
  
  extension [Self <: CollectionName](x: Self) {
    
    inline def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    inline def setExecutionOptions(value: SchematicsExecutionOptions): Self = StObject.set(x, "executionOptions", value.asInstanceOf[js.Any])
    
    inline def setSchematicName(value: String): Self = StObject.set(x, "schematicName", value.asInstanceOf[js.Any])
    
    inline def setSchematicOptions(value: OtherOptions): Self = StObject.set(x, "schematicOptions", value.asInstanceOf[js.Any])
  }
}
