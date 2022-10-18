package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRegistryInput extends StObject {
  
  /**
    * A description of the registry. If description is not provided, there will not be any default value for this.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore, dollar sign, or hash mark. No whitespace.
    */
  var RegistryName: SchemaRegistryNameString
  
  /**
    * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateRegistryInput {
  
  inline def apply(RegistryName: SchemaRegistryNameString): CreateRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegistryInput]
  }
  
  extension [Self <: CreateRegistryInput](x: Self) {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
