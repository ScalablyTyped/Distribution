package typings.actioncable

import typings.actioncable.ActionCable.Cable
import typings.actioncable.ActionCable.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInterface extends StObject {
  
  var cable: js.UndefOr[Cable] = js.native
  
  var network: js.UndefOr[Channel] = js.native
}
object AppInterface {
  
  @scala.inline
  def apply(): AppInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInterface]
  }
  
  @scala.inline
  implicit class AppInterfaceMutableBuilder[Self <: AppInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCable(value: Cable): Self = StObject.set(x, "cable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCableUndefined: Self = StObject.set(x, "cable", js.undefined)
    
    @scala.inline
    def setNetwork(value: Channel): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
