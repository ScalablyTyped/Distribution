package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppResult extends StObject {
  
  var app: App = js.native
}
object GetAppResult {
  
  @scala.inline
  def apply(app: App): GetAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResult]
  }
  
  @scala.inline
  implicit class GetAppResultMutableBuilder[Self <: GetAppResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
