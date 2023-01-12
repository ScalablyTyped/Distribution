package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogKafkaSource extends StObject {
  
  /**
    * Specifies options related to data preview for viewing a sample of your data.
    */
  var DataPreviewOptions: js.UndefOr[StreamingDataPreviewOptions] = js.undefined
  
  /**
    * The name of the database to read from.
    */
  var Database: EnclosedInStringProperty
  
  /**
    * Whether to automatically determine the schema from the incoming data.
    */
  var DetectSchema: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of the data store.
    */
  var Name: NodeName
  
  /**
    * Specifies the streaming options.
    */
  var StreamingOptions: js.UndefOr[KafkaStreamingSourceOptions] = js.undefined
  
  /**
    * The name of the table in the database to read from.
    */
  var Table: EnclosedInStringProperty
  
  /**
    * The amount of time to spend processing each micro batch.
    */
  var WindowSize: js.UndefOr[BoxedPositiveInt] = js.undefined
}
object CatalogKafkaSource {
  
  inline def apply(Database: EnclosedInStringProperty, Name: NodeName, Table: EnclosedInStringProperty): CatalogKafkaSource = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogKafkaSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogKafkaSource] (val x: Self) extends AnyVal {
    
    inline def setDataPreviewOptions(value: StreamingDataPreviewOptions): Self = StObject.set(x, "DataPreviewOptions", value.asInstanceOf[js.Any])
    
    inline def setDataPreviewOptionsUndefined: Self = StObject.set(x, "DataPreviewOptions", js.undefined)
    
    inline def setDatabase(value: EnclosedInStringProperty): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDetectSchema(value: BoxedBoolean): Self = StObject.set(x, "DetectSchema", value.asInstanceOf[js.Any])
    
    inline def setDetectSchemaUndefined: Self = StObject.set(x, "DetectSchema", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStreamingOptions(value: KafkaStreamingSourceOptions): Self = StObject.set(x, "StreamingOptions", value.asInstanceOf[js.Any])
    
    inline def setStreamingOptionsUndefined: Self = StObject.set(x, "StreamingOptions", js.undefined)
    
    inline def setTable(value: EnclosedInStringProperty): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
    
    inline def setWindowSize(value: BoxedPositiveInt): Self = StObject.set(x, "WindowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "WindowSize", js.undefined)
  }
}
