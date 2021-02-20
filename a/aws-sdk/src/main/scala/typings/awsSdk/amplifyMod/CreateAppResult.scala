package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppResult extends StObject {
  
  var app: App = js.native
}
object CreateAppResult {
  
  @scala.inline
  def apply(app: App): CreateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResult]
  }
  
  @scala.inline
  implicit class CreateAppResultMutableBuilder[Self <: CreateAppResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
