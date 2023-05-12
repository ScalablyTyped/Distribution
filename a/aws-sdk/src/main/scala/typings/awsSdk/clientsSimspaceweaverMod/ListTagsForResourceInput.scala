package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: SimSpaceWeaverArn
}
object ListTagsForResourceInput {
  
  inline def apply(ResourceArn: SimSpaceWeaverArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
