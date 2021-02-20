package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteImageBuilderRequest extends StObject {
  
  /**
    * The name of the image builder.
    */
  var Name: typings.awsSdk.appstreamMod.Name = js.native
}
object DeleteImageBuilderRequest {
  
  @scala.inline
  def apply(Name: Name): DeleteImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImageBuilderRequest]
  }
  
  @scala.inline
  implicit class DeleteImageBuilderRequestMutableBuilder[Self <: DeleteImageBuilderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
