package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceSummary extends StObject {
  
  /**
    * The description of the space.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The friendly name of the space displayed to users.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the space.
    */
  var name: NameString
  
  /**
    * The Amazon Web Services Region where the space exists.
    */
  var regionName: RegionString
}
object SpaceSummary {
  
  inline def apply(name: NameString, regionName: RegionString): SpaceSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], regionName = regionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpaceSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegionName(value: RegionString): Self = StObject.set(x, "regionName", value.asInstanceOf[js.Any])
  }
}
