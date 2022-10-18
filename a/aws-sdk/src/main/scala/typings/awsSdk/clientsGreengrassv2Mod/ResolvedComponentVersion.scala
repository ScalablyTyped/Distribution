package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedComponentVersion extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: js.UndefOr[ComponentVersionARN] = js.undefined
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * A message that communicates details about the vendor guidance state of the component version. This message communicates why a component version is discontinued or deleted.
    */
  var message: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The recipe of the component version.
    */
  var recipe: js.UndefOr[RecipeBlob] = js.undefined
  
  /**
    * The vendor guidance state for the component version. This state indicates whether the component version has any issues that you should consider before you deploy it. The vendor guidance state can be:    ACTIVE – This component version is available and recommended for use.    DISCONTINUED – This component version has been discontinued by its publisher. You can deploy this component version, but we recommend that you use a different version of this component.    DELETED – This component version has been deleted by its publisher, so you can't deploy it. If you have any existing deployments that specify this component version, those deployments will fail.  
    */
  var vendorGuidance: js.UndefOr[VendorGuidance] = js.undefined
}
object ResolvedComponentVersion {
  
  inline def apply(): ResolvedComponentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedComponentVersion]
  }
  
  extension [Self <: ResolvedComponentVersion](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRecipe(value: RecipeBlob): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
    
    inline def setVendorGuidance(value: VendorGuidance): Self = StObject.set(x, "vendorGuidance", value.asInstanceOf[js.Any])
    
    inline def setVendorGuidanceUndefined: Self = StObject.set(x, "vendorGuidance", js.undefined)
  }
}
