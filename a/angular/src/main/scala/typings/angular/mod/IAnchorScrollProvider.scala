package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnchorScrollProvider
  extends StObject
     with IServiceProvider {
  
  def disableAutoScrolling(): Unit
}
object IAnchorScrollProvider {
  
  inline def apply($get: js.Any, disableAutoScrolling: () => Unit): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableAutoScrolling = js.Any.fromFunction0(disableAutoScrolling))
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
  
  extension [Self <: IAnchorScrollProvider](x: Self) {
    
    inline def setDisableAutoScrolling(value: () => Unit): Self = StObject.set(x, "disableAutoScrolling", js.Any.fromFunction0(value))
  }
}
