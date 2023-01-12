package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MySQLCatalogTarget extends StObject {
  
  /**
    * The name of the database to write to.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * The name of the table in the database to write to.
    */
  var Table: EnclosedInStringProperty
}
object MySQLCatalogTarget {
  
  inline def apply(
    Database: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName,
    Table: EnclosedInStringProperty
  ): MySQLCatalogTarget = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[MySQLCatalogTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MySQLCatalogTarget] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
