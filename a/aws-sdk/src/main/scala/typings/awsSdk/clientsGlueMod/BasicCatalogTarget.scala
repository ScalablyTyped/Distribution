package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicCatalogTarget extends StObject {
  
  /**
    * The database that contains the table you want to use as the target. This database must already exist in the Data Catalog.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of your data target.
    */
  var Name: NodeName
  
  /**
    * The table that defines the schema of your output data. This table must already exist in the Data Catalog.
    */
  var Table: EnclosedInStringProperty
}
object BasicCatalogTarget {
  
  inline def apply(
    Database: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName,
    Table: EnclosedInStringProperty
  ): BasicCatalogTarget = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicCatalogTarget]
  }
  
  extension [Self <: BasicCatalogTarget](x: Self) {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
