package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityDetectorConfiguration extends StObject {
  
  /**
    * Configuration of statistics that are allowed to be run on columns that contain detected entities. When undefined, no statistics will be computed on columns that contain detected entities.
    */
  var AllowedStatistics: js.UndefOr[AllowedStatisticList] = js.undefined
  
  /**
    * Entity types to detect. Can be any of the following:   USA_SSN   EMAIL   USA_ITIN   USA_PASSPORT_NUMBER   PHONE_NUMBER   USA_DRIVING_LICENSE   BANK_ACCOUNT   CREDIT_CARD   IP_ADDRESS   MAC_ADDRESS   USA_DEA_NUMBER   USA_HCPCS_CODE   USA_NATIONAL_PROVIDER_IDENTIFIER   USA_NATIONAL_DRUG_CODE   USA_HEALTH_INSURANCE_CLAIM_NUMBER   USA_MEDICARE_BENEFICIARY_IDENTIFIER   USA_CPT_CODE   PERSON_NAME   DATE   The Entity type group USA_ALL is also supported, and includes all of the above entity types except PERSON_NAME and DATE.
    */
  var EntityTypes: EntityTypeList
}
object EntityDetectorConfiguration {
  
  inline def apply(EntityTypes: EntityTypeList): EntityDetectorConfiguration = {
    val __obj = js.Dynamic.literal(EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDetectorConfiguration]
  }
  
  extension [Self <: EntityDetectorConfiguration](x: Self) {
    
    inline def setAllowedStatistics(value: AllowedStatisticList): Self = StObject.set(x, "AllowedStatistics", value.asInstanceOf[js.Any])
    
    inline def setAllowedStatisticsUndefined: Self = StObject.set(x, "AllowedStatistics", js.undefined)
    
    inline def setAllowedStatisticsVarargs(value: AllowedStatistics*): Self = StObject.set(x, "AllowedStatistics", js.Array(value*))
    
    inline def setEntityTypes(value: EntityTypeList): Self = StObject.set(x, "EntityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "EntityTypes", js.Array(value*))
  }
}
