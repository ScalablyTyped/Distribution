package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRasterDataCollectionOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the raster data collection.
    */
  var Arn: DataCollectionArn
  
  /**
    * A description of the raster data collection.
    */
  var Description: String
  
  /**
    * The URL of the description page.
    */
  var DescriptionPageUrl: String
  
  /**
    * The list of image source bands in the raster data collection.
    */
  var ImageSourceBands: ImageSourceBandList
  
  /**
    * The name of the raster data collection.
    */
  var Name: String
  
  /**
    * The filters supported by the raster data collection.
    */
  var SupportedFilters: FilterList
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
  
  /**
    * The raster data collection type.
    */
  var Type: DataCollectionType
}
object GetRasterDataCollectionOutput {
  
  inline def apply(
    Arn: DataCollectionArn,
    Description: String,
    DescriptionPageUrl: String,
    ImageSourceBands: ImageSourceBandList,
    Name: String,
    SupportedFilters: FilterList,
    Type: DataCollectionType
  ): GetRasterDataCollectionOutput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DescriptionPageUrl = DescriptionPageUrl.asInstanceOf[js.Any], ImageSourceBands = ImageSourceBands.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SupportedFilters = SupportedFilters.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRasterDataCollectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRasterDataCollectionOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DataCollectionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionPageUrl(value: String): Self = StObject.set(x, "DescriptionPageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageSourceBands(value: ImageSourceBandList): Self = StObject.set(x, "ImageSourceBands", value.asInstanceOf[js.Any])
    
    inline def setImageSourceBandsVarargs(value: String*): Self = StObject.set(x, "ImageSourceBands", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSupportedFilters(value: FilterList): Self = StObject.set(x, "SupportedFilters", value.asInstanceOf[js.Any])
    
    inline def setSupportedFiltersVarargs(value: Filter*): Self = StObject.set(x, "SupportedFilters", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: DataCollectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
