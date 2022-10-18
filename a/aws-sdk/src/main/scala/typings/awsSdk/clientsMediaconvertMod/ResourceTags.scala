package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTags extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
}
object ResourceTags {
  
  inline def apply(): ResourceTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTags]
  }
  
  extension [Self <: ResourceTags](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
