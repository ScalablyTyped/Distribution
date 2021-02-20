package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deeplink extends StObject {
  
  var `deep-link`: String = js.native
  
  var `group-name`: String = js.native
  
  var `stream-name`: String = js.native
}
object Deeplink {
  
  @scala.inline
  def apply(`deep-link`: String, `group-name`: String, `stream-name`: String): Deeplink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deep-link")(`deep-link`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-name")(`group-name`.asInstanceOf[js.Any])
    __obj.updateDynamic("stream-name")(`stream-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deeplink]
  }
  
  @scala.inline
  implicit class DeeplinkMutableBuilder[Self <: Deeplink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDeep-link`(value: String): Self = StObject.set(x, "deep-link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGroup-name`(value: String): Self = StObject.set(x, "group-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStream-name`(value: String): Self = StObject.set(x, "stream-name", value.asInstanceOf[js.Any])
  }
}
