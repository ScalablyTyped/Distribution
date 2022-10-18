package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * A description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * A name for the application.
    */
  var Name: typings.awsSdk.clientsAppconfigMod.Name
  
  /**
    * Metadata to assign to the application. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(Name: Name): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  extension [Self <: CreateApplicationRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
