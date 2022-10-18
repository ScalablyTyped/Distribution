package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomatedAbrRule extends StObject {
  
  /**
    * When customer adds the allowed renditions rule for auto ABR ladder, they are required to add at leat one rendition to allowedRenditions list
    */
  var AllowedRenditions: js.UndefOr[listOfAllowedRenditionSize] = js.undefined
  
  /**
    * When customer adds the force include renditions rule for auto ABR ladder, they are required to add at leat one rendition to forceIncludeRenditions list
    */
  var ForceIncludeRenditions: js.UndefOr[listOfForceIncludeRenditionSize] = js.undefined
  
  /**
    * Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top rendition size.
    */
  var MinBottomRenditionSize: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.MinBottomRenditionSize] = js.undefined
  
  /**
    * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or equal to, Max resolution.
    */
  var MinTopRenditionSize: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.MinTopRenditionSize] = js.undefined
  
  /**
    * Use Min top rendition size to specify a minimum size for the highest resolution in your ABR stack. * The highest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 1280x720 the highest resolution in your ABR stack will be equal to or greater than 1280x720. * If you specify a value for Max resolution, the value that you specify for Min top rendition size must be less than, or equal to, Max resolution. Use Min bottom rendition size to specify a minimum size for the lowest resolution in your ABR stack. * The lowest resolution in your ABR stack will be equal to or greater than the value that you enter. For example: If you specify 640x360 the lowest resolution in your ABR stack will be equal to or greater than to 640x360. * If you specify a Min top rendition size rule, the value that you specify for Min bottom rendition size must be less than, or equal to, Min top rendition size. Use Force include renditions to specify one or more resolutions to include your ABR stack. * (Recommended) To optimize automated ABR, specify as few resolutions as possible. * (Required) The number of resolutions that you specify must be equal to, or less than, the Max renditions setting. * If you specify a Min top rendition size rule, specify at least one resolution that is equal to, or greater than, Min top rendition size. * If you specify a Min bottom rendition size rule, only specify resolutions that are equal to, or greater than, Min bottom rendition size. * If you specify a Force include renditions rule, do not specify a separate rule for Allowed renditions. * Note: The ABR stack may include other resolutions that you do not specify here, depending on the Max renditions setting. Use Allowed renditions to specify a list of possible resolutions in your ABR stack. * (Required) The number of resolutions that you specify must be equal to, or greater than, the Max renditions setting. * MediaConvert will create an ABR stack exclusively from the list of resolutions that you specify. * Some resolutions in the Allowed renditions list may not be included, however you can force a resolution to be included by setting Required to ENABLED. * You must specify at least one resolution that is greater than or equal to any resolutions that you specify in Min top rendition size or Min bottom rendition size. * If you specify Allowed renditions, you must not specify a separate rule for Force include renditions.
    */
  var Type: js.UndefOr[RuleType] = js.undefined
}
object AutomatedAbrRule {
  
  inline def apply(): AutomatedAbrRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedAbrRule]
  }
  
  extension [Self <: AutomatedAbrRule](x: Self) {
    
    inline def setAllowedRenditions(value: listOfAllowedRenditionSize): Self = StObject.set(x, "AllowedRenditions", value.asInstanceOf[js.Any])
    
    inline def setAllowedRenditionsUndefined: Self = StObject.set(x, "AllowedRenditions", js.undefined)
    
    inline def setAllowedRenditionsVarargs(value: AllowedRenditionSize*): Self = StObject.set(x, "AllowedRenditions", js.Array(value*))
    
    inline def setForceIncludeRenditions(value: listOfForceIncludeRenditionSize): Self = StObject.set(x, "ForceIncludeRenditions", value.asInstanceOf[js.Any])
    
    inline def setForceIncludeRenditionsUndefined: Self = StObject.set(x, "ForceIncludeRenditions", js.undefined)
    
    inline def setForceIncludeRenditionsVarargs(value: ForceIncludeRenditionSize*): Self = StObject.set(x, "ForceIncludeRenditions", js.Array(value*))
    
    inline def setMinBottomRenditionSize(value: MinBottomRenditionSize): Self = StObject.set(x, "MinBottomRenditionSize", value.asInstanceOf[js.Any])
    
    inline def setMinBottomRenditionSizeUndefined: Self = StObject.set(x, "MinBottomRenditionSize", js.undefined)
    
    inline def setMinTopRenditionSize(value: MinTopRenditionSize): Self = StObject.set(x, "MinTopRenditionSize", value.asInstanceOf[js.Any])
    
    inline def setMinTopRenditionSizeUndefined: Self = StObject.set(x, "MinTopRenditionSize", js.undefined)
    
    inline def setType(value: RuleType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
