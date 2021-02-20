package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotResource extends StObject {
  
  var NotResource: String | js.Array[String] = js.native
}
object NotResource {
  
  @scala.inline
  def apply(NotResource: String | js.Array[String]): NotResource = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotResource]
  }
  
  @scala.inline
  implicit class NotResourceMutableBuilder[Self <: NotResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
  }
}
