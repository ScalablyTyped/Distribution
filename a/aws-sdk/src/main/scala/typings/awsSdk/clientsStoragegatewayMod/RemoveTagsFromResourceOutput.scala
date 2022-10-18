package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsFromResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that the tags were removed from.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ResourceARN] = js.undefined
}
object RemoveTagsFromResourceOutput {
  
  inline def apply(): RemoveTagsFromResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveTagsFromResourceOutput]
  }
  
  extension [Self <: RemoveTagsFromResourceOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
