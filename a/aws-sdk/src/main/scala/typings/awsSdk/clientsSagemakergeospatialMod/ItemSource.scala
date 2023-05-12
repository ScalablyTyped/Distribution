package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemSource extends StObject {
  
  /**
    * This is a dictionary of Asset Objects data associated with the Item that can be downloaded or streamed, each with a unique key.
    */
  var Assets: js.UndefOr[AssetsMap] = js.undefined
  
  /**
    * The searchable date and time of the item, in UTC.
    */
  var DateTime: js.Date
  
  /**
    * The item Geometry in GeoJson format.
    */
  var Geometry: typings.awsSdk.clientsSagemakergeospatialMod.Geometry
  
  /**
    * A unique Id for the source item.
    */
  var Id: String
  
  /**
    * This field contains additional properties of the item.
    */
  var Properties: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.Properties] = js.undefined
}
object ItemSource {
  
  inline def apply(DateTime: js.Date, Geometry: Geometry, Id: String): ItemSource = {
    val __obj = js.Dynamic.literal(DateTime = DateTime.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemSource] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: AssetsMap): Self = StObject.set(x, "Assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "Assets", js.undefined)
    
    inline def setDateTime(value: js.Date): Self = StObject.set(x, "DateTime", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
