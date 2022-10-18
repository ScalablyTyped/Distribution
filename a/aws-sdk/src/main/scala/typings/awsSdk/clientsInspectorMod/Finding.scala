package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finding extends StObject {
  
  /**
    * The ARN that specifies the finding.
    */
  var arn: Arn
  
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var assetAttributes: js.UndefOr[AssetAttributes] = js.undefined
  
  /**
    * The type of the host from which the finding is generated.
    */
  var assetType: js.UndefOr[AssetType] = js.undefined
  
  /**
    * The system-defined attributes for the finding.
    */
  var attributes: AttributeList
  
  /**
    * This data element is currently not used.
    */
  var confidence: js.UndefOr[IocConfidence] = js.undefined
  
  /**
    * The time when the finding was generated.
    */
  var createdAt: js.Date
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[Text] = js.undefined
  
  /**
    * The ID of the finding.
    */
  var id: js.UndefOr[FindingId] = js.undefined
  
  /**
    * This data element is currently not used.
    */
  var indicatorOfCompromise: js.UndefOr[Bool] = js.undefined
  
  /**
    * The numeric value of the finding severity.
    */
  var numericSeverity: js.UndefOr[NumericSeverity] = js.undefined
  
  /**
    * The recommendation for the finding.
    */
  var recommendation: js.UndefOr[Text] = js.undefined
  
  /**
    * The schema version of this data type.
    */
  var schemaVersion: js.UndefOr[NumericVersion] = js.undefined
  
  /**
    * The data element is set to "Inspector".
    */
  var service: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * This data type is used in the Finding data type.
    */
  var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined
  
  /**
    * The finding severity. Values can be set to High, Medium, Low, and Informational.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
    * The name of the finding.
    */
  var title: js.UndefOr[Text] = js.undefined
  
  /**
    * The time when AddAttributesToFindings is called.
    */
  var updatedAt: js.Date
  
  /**
    * The user-defined attributes that are assigned to the finding.
    */
  var userAttributes: UserAttributeList
}
object Finding {
  
  inline def apply(
    arn: Arn,
    attributes: AttributeList,
    createdAt: js.Date,
    updatedAt: js.Date,
    userAttributes: UserAttributeList
  ): Finding = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
  
  extension [Self <: Finding](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setAssetAttributes(value: AssetAttributes): Self = StObject.set(x, "assetAttributes", value.asInstanceOf[js.Any])
    
    inline def setAssetAttributesUndefined: Self = StObject.set(x, "assetAttributes", js.undefined)
    
    inline def setAssetType(value: AssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setConfidence(value: IocConfidence): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndicatorOfCompromise(value: Bool): Self = StObject.set(x, "indicatorOfCompromise", value.asInstanceOf[js.Any])
    
    inline def setIndicatorOfCompromiseUndefined: Self = StObject.set(x, "indicatorOfCompromise", js.undefined)
    
    inline def setNumericSeverity(value: NumericSeverity): Self = StObject.set(x, "numericSeverity", value.asInstanceOf[js.Any])
    
    inline def setNumericSeverityUndefined: Self = StObject.set(x, "numericSeverity", js.undefined)
    
    inline def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setSchemaVersion(value: NumericVersion): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
    
    inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
    
    inline def setService(value: ServiceName): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceAttributes(value: InspectorServiceAttributes): Self = StObject.set(x, "serviceAttributes", value.asInstanceOf[js.Any])
    
    inline def setServiceAttributesUndefined: Self = StObject.set(x, "serviceAttributes", js.undefined)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUserAttributes(value: UserAttributeList): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setUserAttributesVarargs(value: Attribute*): Self = StObject.set(x, "userAttributes", js.Array(value*))
  }
}
