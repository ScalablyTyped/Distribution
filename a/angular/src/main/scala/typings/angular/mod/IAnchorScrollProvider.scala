package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnchorScrollProvider extends IServiceProvider {
  
  def disableAutoScrolling(): Unit = js.native
}
object IAnchorScrollProvider {
  
  @scala.inline
  def apply($get: js.Any, disableAutoScrolling: () => Unit): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableAutoScrolling = js.Any.fromFunction0(disableAutoScrolling))
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
  
  @scala.inline
  implicit class IAnchorScrollProviderMutableBuilder[Self <: IAnchorScrollProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableAutoScrolling(value: () => Unit): Self = StObject.set(x, "disableAutoScrolling", js.Any.fromFunction0(value))
  }
}
