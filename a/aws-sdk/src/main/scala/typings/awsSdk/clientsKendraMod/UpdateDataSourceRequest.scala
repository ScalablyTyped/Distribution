package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDataSourceRequest extends StObject {
  
  /**
    * Configuration information you want to update for the data source connector.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined
  
  /**
    * Configuration information you want to update for altering document metadata and content during the document ingestion process. For more information on how to create, modify and delete document metadata, or make other content alterations when you ingest documents into Amazon Kendra, see Customizing document metadata during the ingestion process.
    */
  var CustomDocumentEnrichmentConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.CustomDocumentEnrichmentConfiguration] = js.undefined
  
  /**
    * A new description for the data source connector.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * The identifier of the data source connector you want to update.
    */
  var Id: DataSourceId
  
  /**
    * The identifier of the index used with the data source connector.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The code for a language you want to update for the data source connector. This allows you to support a language for all documents when updating the data source. English is supported by default. For more information on supported languages, including their codes, see Adding documents in languages other than English.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsKendraMod.LanguageCode] = js.undefined
  
  /**
    * A new name for the data source connector.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source and required resources. For more information, see IAM roles for Amazon Kendra.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * The sync schedule you want to update for the data source connector.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object UpdateDataSourceRequest {
  
  inline def apply(Id: DataSourceId, IndexId: IndexId): UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDataSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCustomDocumentEnrichmentConfiguration(value: CustomDocumentEnrichmentConfiguration): Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomDocumentEnrichmentConfigurationUndefined: Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
