package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CatalogHudiSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalHudiOptions: js.UndefOr[AdditionalOptions] = js.undefined
  
  /**
    * The name of the database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the Hudi data source.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the Hudi source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * The name of the table in the database to read from.
    */
  var Table: EnclosedInStringProperty
}
object S3CatalogHudiSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): S3CatalogHudiSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CatalogHudiSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3CatalogHudiSource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalHudiOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalHudiOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalHudiOptionsUndefined: Self = StObject.set(x, "AdditionalHudiOptions", js.undefined)
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
