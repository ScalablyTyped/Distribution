package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageLensConfigurationTaggingResult extends StObject {
  
  /**
    * The tags of S3 Storage Lens configuration requested.
    */
  var Tags: js.UndefOr[StorageLensTags] = js.undefined
}
object GetStorageLensConfigurationTaggingResult {
  
  inline def apply(): GetStorageLensConfigurationTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageLensConfigurationTaggingResult]
  }
  
  extension [Self <: GetStorageLensConfigurationTaggingResult](x: Self) {
    
    inline def setTags(value: StorageLensTags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: StorageLensTag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
