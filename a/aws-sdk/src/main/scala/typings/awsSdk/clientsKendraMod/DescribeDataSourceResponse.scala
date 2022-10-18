package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataSourceResponse extends StObject {
  
  /**
    * Configuration details for the data source connector. This shows how the data source is configured. The configuration options for a data source depend on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.undefined
  
  /**
    * The Unix timestamp of when the data source connector was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configuration information for altering document metadata and content during the document ingestion process when you describe a data source. For more information on how to create, modify and delete document metadata, or make other content alterations when you ingest documents into Amazon Kendra, see Customizing document metadata during the ingestion process.
    */
  var CustomDocumentEnrichmentConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.CustomDocumentEnrichmentConfiguration] = js.undefined
  
  /**
    * The description for the data source connector.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendraMod.Description] = js.undefined
  
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.clientsKendraMod.ErrorMessage] = js.undefined
  
  /**
    * The identifier of the data source connector.
    */
  var Id: js.UndefOr[DataSourceId] = js.undefined
  
  /**
    * The identifier of the index used with the data source connector.
    */
  var IndexId: js.UndefOr[typings.awsSdk.clientsKendraMod.IndexId] = js.undefined
  
  /**
    * The code for a language. This shows a supported language for all documents in the data source. English is supported by default. For more information on supported languages, including their codes, see Adding documents in languages other than English.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsKendraMod.LanguageCode] = js.undefined
  
  /**
    * The name for the data source connector.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsKendraMod.RoleArn] = js.undefined
  
  /**
    * The schedule for Amazon Kendra to update the index.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.undefined
  
  /**
    * The current status of the data source connector. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
  
  /**
    * The type of the data source. For example, SHAREPOINT.
    */
  var Type: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * The Unix timestamp of when the data source connector was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your data source. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object DescribeDataSourceResponse {
  
  inline def apply(): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
  
  extension [Self <: DescribeDataSourceResponse](x: Self) {
    
    inline def setConfiguration(value: DataSourceConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setCustomDocumentEnrichmentConfiguration(value: CustomDocumentEnrichmentConfiguration): Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomDocumentEnrichmentConfigurationUndefined: Self = StObject.set(x, "CustomDocumentEnrichmentConfiguration", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "IndexId", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: ScanSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
