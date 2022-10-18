package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreRequest extends StObject {
  
  /**
    * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation. The Days element is required for regular restores, and must not be provided for select requests.
    */
  var Days: js.UndefOr[typings.awsSdk.clientsS3Mod.Days] = js.undefined
  
  /**
    * The optional description for the job.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsS3Mod.Description] = js.undefined
  
  /**
    * S3 Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
    */
  var GlacierJobParameters: js.UndefOr[typings.awsSdk.clientsS3Mod.GlacierJobParameters] = js.undefined
  
  /**
    * Describes the location where the restore job's output is stored.
    */
  var OutputLocation: js.UndefOr[typings.awsSdk.clientsS3Mod.OutputLocation] = js.undefined
  
  /**
    * Describes the parameters for Select job types.
    */
  var SelectParameters: js.UndefOr[typings.awsSdk.clientsS3Mod.SelectParameters] = js.undefined
  
  /**
    * Retrieval tier at which the restore will be processed.
    */
  var Tier: js.UndefOr[typings.awsSdk.clientsS3Mod.Tier] = js.undefined
  
  /**
    * Type of restore request.
    */
  var Type: js.UndefOr[RestoreRequestType] = js.undefined
}
object RestoreRequest {
  
  inline def apply(): RestoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreRequest]
  }
  
  extension [Self <: RestoreRequest](x: Self) {
    
    inline def setDays(value: Days): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "Days", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlacierJobParameters(value: GlacierJobParameters): Self = StObject.set(x, "GlacierJobParameters", value.asInstanceOf[js.Any])
    
    inline def setGlacierJobParametersUndefined: Self = StObject.set(x, "GlacierJobParameters", js.undefined)
    
    inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setSelectParameters(value: SelectParameters): Self = StObject.set(x, "SelectParameters", value.asInstanceOf[js.Any])
    
    inline def setSelectParametersUndefined: Self = StObject.set(x, "SelectParameters", js.undefined)
    
    inline def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setType(value: RestoreRequestType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
