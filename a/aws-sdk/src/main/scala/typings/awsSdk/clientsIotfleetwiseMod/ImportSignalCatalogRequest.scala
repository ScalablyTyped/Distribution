package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSignalCatalogRequest extends StObject {
  
  /**
    *  A brief description of the signal catalog. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The name of the signal catalog to import.
    */
  var name: resourceName
  
  /**
    * Metadata that can be used to manage the signal catalog.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The contents of the Vehicle Signal Specification (VSS) configuration. VSS is a precise language used to describe and model signals in vehicle networks.
    */
  var vss: js.UndefOr[FormattedVss] = js.undefined
}
object ImportSignalCatalogRequest {
  
  inline def apply(name: resourceName): ImportSignalCatalogRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSignalCatalogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportSignalCatalogRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: resourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVss(value: FormattedVss): Self = StObject.set(x, "vss", value.asInstanceOf[js.Any])
    
    inline def setVssUndefined: Self = StObject.set(x, "vss", js.undefined)
  }
}
