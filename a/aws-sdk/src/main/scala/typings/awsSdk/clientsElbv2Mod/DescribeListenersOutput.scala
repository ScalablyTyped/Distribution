package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeListenersOutput extends StObject {
  
  /**
    * Information about the listeners.
    */
  var Listeners: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Listeners] = js.undefined
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}
object DescribeListenersOutput {
  
  inline def apply(): DescribeListenersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenersOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeListenersOutput] (val x: Self) extends AnyVal {
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
