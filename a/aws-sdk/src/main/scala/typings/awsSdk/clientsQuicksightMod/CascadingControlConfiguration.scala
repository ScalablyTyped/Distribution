package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CascadingControlConfiguration extends StObject {
  
  /**
    * A list of source controls that determine the values that are used in the current control.
    */
  var SourceControls: js.UndefOr[CascadingControlSourceList] = js.undefined
}
object CascadingControlConfiguration {
  
  inline def apply(): CascadingControlConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadingControlConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CascadingControlConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSourceControls(value: CascadingControlSourceList): Self = StObject.set(x, "SourceControls", value.asInstanceOf[js.Any])
    
    inline def setSourceControlsUndefined: Self = StObject.set(x, "SourceControls", js.undefined)
    
    inline def setSourceControlsVarargs(value: CascadingControlSource*): Self = StObject.set(x, "SourceControls", js.Array(value*))
  }
}
