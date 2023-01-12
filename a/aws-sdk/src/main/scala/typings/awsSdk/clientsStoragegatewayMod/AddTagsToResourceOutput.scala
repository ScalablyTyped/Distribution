package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ResourceARN] = js.undefined
}
object AddTagsToResourceOutput {
  
  inline def apply(): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTagsToResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
