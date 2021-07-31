package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopImageBuilderRequest extends StObject {
  
  /**
    * The name of the image builder.
    */
  var Name: String
}
object StopImageBuilderRequest {
  
  @scala.inline
  def apply(Name: String): StopImageBuilderRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopImageBuilderRequest]
  }
  
  @scala.inline
  implicit class StopImageBuilderRequestMutableBuilder[Self <: StopImageBuilderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
