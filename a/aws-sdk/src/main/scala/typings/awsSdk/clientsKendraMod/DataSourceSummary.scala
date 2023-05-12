package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSummary extends StObject {
  
  /**
    * The Unix timestamp when the data source connector was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.undefined
  
  /**
    * The code for a language. This shows a supported language for all documents in the data source. English is supported by default. For more information on supported languages, including their codes, see Adding documents in languages other than English.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsKendraMod.LanguageCode] = js.undefined
  
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The status of the data source. When the status is ACTIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * The Unix timestamp when the data source connector was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DataSourceSummary {
  
  inline def apply(): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
