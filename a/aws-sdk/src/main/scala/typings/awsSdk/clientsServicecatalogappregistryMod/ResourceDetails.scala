package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * The value of the tag.
    */
  var tagValue: js.UndefOr[TagValue] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceDetails] (val x: Self) extends AnyVal {
    
    inline def setTagValue(value: TagValue): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
    
    inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
  }
}
