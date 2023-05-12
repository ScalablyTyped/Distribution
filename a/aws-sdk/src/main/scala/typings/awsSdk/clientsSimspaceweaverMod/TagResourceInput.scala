package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to add tags to. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: SimSpaceWeaverArn
  
  /**
    * A list of tags to apply to the resource.
    */
  var Tags: TagMap
}
object TagResourceInput {
  
  inline def apply(ResourceArn: SimSpaceWeaverArn, Tags: TagMap): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceInput] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: SimSpaceWeaverArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
