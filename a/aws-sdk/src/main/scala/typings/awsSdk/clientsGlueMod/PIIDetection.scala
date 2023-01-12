package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PIIDetection extends StObject {
  
  /**
    * Indicates the types of entities the PIIDetection transform will identify as PII data.   PII type entities include: PERSON_NAME, DATE, USA_SNN, EMAIL, USA_ITIN, USA_PASSPORT_NUMBER, PHONE_NUMBER, BANK_ACCOUNT, IP_ADDRESS, MAC_ADDRESS, USA_CPT_CODE, USA_HCPCS_CODE, USA_NATIONAL_DRUG_CODE, USA_MEDICARE_BENEFICIARY_IDENTIFIER, USA_HEALTH_INSURANCE_CLAIM_NUMBER,CREDIT_CARD,USA_NATIONAL_PROVIDER_IDENTIFIER,USA_DEA_NUMBER,USA_DRIVING_LICENSE 
    */
  var EntityTypesToDetect: EnclosedInStringProperties
  
  /**
    * The node ID inputs to the transform.
    */
  var Inputs: OneInput
  
  /**
    * Indicates the value that will replace the detected entity. 
    */
  var MaskValue: js.UndefOr[typings.awsSdk.clientsGlueMod.MaskValue] = js.undefined
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * Indicates the output column name that will contain any entity type detected in that row. 
    */
  var OutputColumnName: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Indicates the type of PIIDetection transform. 
    */
  var PiiType: typings.awsSdk.clientsGlueMod.PiiType
  
  /**
    * Indicates the fraction of the data to sample when scanning for PII entities. 
    */
  var SampleFraction: js.UndefOr[BoxedDoubleFraction] = js.undefined
  
  /**
    * Indicates the fraction of the data that must be met in order for a column to be identified as PII data. 
    */
  var ThresholdFraction: js.UndefOr[BoxedDoubleFraction] = js.undefined
}
object PIIDetection {
  
  inline def apply(
    EntityTypesToDetect: EnclosedInStringProperties,
    Inputs: OneInput,
    Name: NodeName,
    PiiType: PiiType
  ): PIIDetection = {
    val __obj = js.Dynamic.literal(EntityTypesToDetect = EntityTypesToDetect.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PiiType = PiiType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PIIDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PIIDetection] (val x: Self) extends AnyVal {
    
    inline def setEntityTypesToDetect(value: EnclosedInStringProperties): Self = StObject.set(x, "EntityTypesToDetect", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesToDetectVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "EntityTypesToDetect", js.Array(value*))
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setMaskValue(value: MaskValue): Self = StObject.set(x, "MaskValue", value.asInstanceOf[js.Any])
    
    inline def setMaskValueUndefined: Self = StObject.set(x, "MaskValue", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputColumnName(value: EnclosedInStringProperty): Self = StObject.set(x, "OutputColumnName", value.asInstanceOf[js.Any])
    
    inline def setOutputColumnNameUndefined: Self = StObject.set(x, "OutputColumnName", js.undefined)
    
    inline def setPiiType(value: PiiType): Self = StObject.set(x, "PiiType", value.asInstanceOf[js.Any])
    
    inline def setSampleFraction(value: BoxedDoubleFraction): Self = StObject.set(x, "SampleFraction", value.asInstanceOf[js.Any])
    
    inline def setSampleFractionUndefined: Self = StObject.set(x, "SampleFraction", js.undefined)
    
    inline def setThresholdFraction(value: BoxedDoubleFraction): Self = StObject.set(x, "ThresholdFraction", value.asInstanceOf[js.Any])
    
    inline def setThresholdFractionUndefined: Self = StObject.set(x, "ThresholdFraction", js.undefined)
  }
}
