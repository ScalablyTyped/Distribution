package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDataCollectionMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the raster data collection.
    */
  var Arn: DataCollectionArn
  
  /**
    * A description of the raster data collection.
    */
  var Description: String
  
  /**
    * The description URL of the raster data collection.
    */
  var DescriptionPageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the raster data collection.
    */
  var Name: String
  
  /**
    * The list of filters supported by the raster data collection.
    */
  var SupportedFilters: FilterList
  
  /**
    * Each tag consists of a key and a value.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Tags] = js.undefined
  
  /**
    * The type of raster data collection.
    */
  var Type: DataCollectionType
}
object RasterDataCollectionMetadata {
  
  inline def apply(
    Arn: DataCollectionArn,
    Description: String,
    Name: String,
    SupportedFilters: FilterList,
    Type: DataCollectionType
  ): RasterDataCollectionMetadata = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SupportedFilters = SupportedFilters.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataCollectionMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterDataCollectionMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DataCollectionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionPageUrl(value: String): Self = StObject.set(x, "DescriptionPageUrl", value.asInstanceOf[js.Any])
    
    inline def setDescriptionPageUrlUndefined: Self = StObject.set(x, "DescriptionPageUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSupportedFilters(value: FilterList): Self = StObject.set(x, "SupportedFilters", value.asInstanceOf[js.Any])
    
    inline def setSupportedFiltersVarargs(value: Filter*): Self = StObject.set(x, "SupportedFilters", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: DataCollectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
