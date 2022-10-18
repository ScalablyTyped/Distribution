package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceResult extends StObject {
  
  /**
    * The list of tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.Tags] = js.undefined
}
object TagResourceResult {
  
  inline def apply(): TagResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceResult]
  }
  
  extension [Self <: TagResourceResult](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
