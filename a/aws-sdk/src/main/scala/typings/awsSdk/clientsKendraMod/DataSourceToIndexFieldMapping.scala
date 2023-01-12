package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceToIndexFieldMapping extends StObject {
  
  /**
    * The name of the column or attribute in the data source.
    */
  var DataSourceFieldName: typings.awsSdk.clientsKendraMod.DataSourceFieldName
  
  /**
    * The type of data stored in the column or attribute.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined
  
  /**
    * The name of the field in the index.
    */
  var IndexFieldName: typings.awsSdk.clientsKendraMod.IndexFieldName
}
object DataSourceToIndexFieldMapping {
  
  inline def apply(DataSourceFieldName: DataSourceFieldName, IndexFieldName: IndexFieldName): DataSourceToIndexFieldMapping = {
    val __obj = js.Dynamic.literal(DataSourceFieldName = DataSourceFieldName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceToIndexFieldMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceToIndexFieldMapping] (val x: Self) extends AnyVal {
    
    inline def setDataSourceFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DataSourceFieldName", value.asInstanceOf[js.Any])
    
    inline def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = StObject.set(x, "DateFieldFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFieldFormatUndefined: Self = StObject.set(x, "DateFieldFormat", js.undefined)
    
    inline def setIndexFieldName(value: IndexFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
  }
}
