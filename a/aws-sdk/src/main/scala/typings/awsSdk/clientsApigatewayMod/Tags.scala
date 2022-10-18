package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tags extends StObject {
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}
object Tags {
  
  inline def apply(): Tags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tags]
  }
  
  extension [Self <: Tags](x: Self) {
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
