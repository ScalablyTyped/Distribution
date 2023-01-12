package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CatalogSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalOptions: js.UndefOr[S3SourceAdditionalOptions] = js.undefined
  
  /**
    * The database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * The name of the data store.
    */
  var Name: NodeName
  
  /**
    * Partitions satisfying this predicate are deleted. Files within the retention period in these partitions are not deleted. Set to "" – empty by default.
    */
  var PartitionPredicate: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The database table to read from.
    */
  var Table: EnclosedInStringProperty
}
object S3CatalogSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): S3CatalogSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CatalogSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3CatalogSource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOptions(value: S3SourceAdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPartitionPredicate(value: EnclosedInStringProperty): Self = StObject.set(x, "PartitionPredicate", value.asInstanceOf[js.Any])
    
    inline def setPartitionPredicateUndefined: Self = StObject.set(x, "PartitionPredicate", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
