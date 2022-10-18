package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastActiveDefinition extends StObject {
  
  /**
    * Specifies a path in Amazon S3 where the blueprint is published by the Glue developer.
    */
  var BlueprintLocation: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Specifies a path in Amazon S3 where the blueprint is copied when you create or update the blueprint.
    */
  var BlueprintServiceLocation: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The description of the blueprint.
    */
  var Description: js.UndefOr[Generic512CharString] = js.undefined
  
  /**
    * The date and time the blueprint was last modified.
    */
  var LastModifiedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A JSON string specifying the parameters for the blueprint.
    */
  var ParameterSpec: js.UndefOr[BlueprintParameterSpec] = js.undefined
}
object LastActiveDefinition {
  
  inline def apply(): LastActiveDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastActiveDefinition]
  }
  
  extension [Self <: LastActiveDefinition](x: Self) {
    
    inline def setBlueprintLocation(value: GenericString): Self = StObject.set(x, "BlueprintLocation", value.asInstanceOf[js.Any])
    
    inline def setBlueprintLocationUndefined: Self = StObject.set(x, "BlueprintLocation", js.undefined)
    
    inline def setBlueprintServiceLocation(value: GenericString): Self = StObject.set(x, "BlueprintServiceLocation", value.asInstanceOf[js.Any])
    
    inline def setBlueprintServiceLocationUndefined: Self = StObject.set(x, "BlueprintServiceLocation", js.undefined)
    
    inline def setDescription(value: Generic512CharString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "LastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOnUndefined: Self = StObject.set(x, "LastModifiedOn", js.undefined)
    
    inline def setParameterSpec(value: BlueprintParameterSpec): Self = StObject.set(x, "ParameterSpec", value.asInstanceOf[js.Any])
    
    inline def setParameterSpecUndefined: Self = StObject.set(x, "ParameterSpec", js.undefined)
  }
}
