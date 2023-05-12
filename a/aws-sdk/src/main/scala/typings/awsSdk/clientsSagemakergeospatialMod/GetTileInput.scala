package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTileInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the tile operation.
    */
  var Arn: EarthObservationJobArn
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specify.
    */
  var ExecutionRoleArn: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.ExecutionRoleArn] = js.undefined
  
  /**
    * The particular assets or bands to tile.
    */
  var ImageAssets: StringListInput
  
  /**
    * Determines whether or not to return a valid data mask.
    */
  var ImageMask: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The output data type of the tile operation.
    */
  var OutputDataType: js.UndefOr[OutputType] = js.undefined
  
  /**
    * The data format of the output tile. The formats include .npy, .png and .jpg.
    */
  var OutputFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Property filters for the imagery to tile.
    */
  var PropertyFilters: js.UndefOr[String] = js.undefined
  
  /**
    * Determines what part of the Earth Observation job to tile. 'INPUT' or 'OUTPUT' are the valid options.
    */
  var Target: TargetOptions
  
  /**
    * Time range filter applied to imagery to find the images to tile.
    */
  var TimeRangeFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The x coordinate of the tile input.
    */
  var x: Integer
  
  /**
    * The y coordinate of the tile input.
    */
  var y: Integer
  
  /**
    * The z coordinate of the tile input.
    */
  var z: Integer
}
object GetTileInput {
  
  inline def apply(
    Arn: EarthObservationJobArn,
    ImageAssets: StringListInput,
    Target: TargetOptions,
    x: Integer,
    y: Integer,
    z: Integer
  ): GetTileInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ImageAssets = ImageAssets.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTileInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTileInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: EarthObservationJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: ExecutionRoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setImageAssets(value: StringListInput): Self = StObject.set(x, "ImageAssets", value.asInstanceOf[js.Any])
    
    inline def setImageAssetsVarargs(value: String*): Self = StObject.set(x, "ImageAssets", js.Array(value*))
    
    inline def setImageMask(value: Boolean): Self = StObject.set(x, "ImageMask", value.asInstanceOf[js.Any])
    
    inline def setImageMaskUndefined: Self = StObject.set(x, "ImageMask", js.undefined)
    
    inline def setOutputDataType(value: OutputType): Self = StObject.set(x, "OutputDataType", value.asInstanceOf[js.Any])
    
    inline def setOutputDataTypeUndefined: Self = StObject.set(x, "OutputDataType", js.undefined)
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setPropertyFilters(value: String): Self = StObject.set(x, "PropertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "PropertyFilters", js.undefined)
    
    inline def setTarget(value: TargetOptions): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilter(value: String): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilterUndefined: Self = StObject.set(x, "TimeRangeFilter", js.undefined)
    
    inline def setX(value: Integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Integer): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
