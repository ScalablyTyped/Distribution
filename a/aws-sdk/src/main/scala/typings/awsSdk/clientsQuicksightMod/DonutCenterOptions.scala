package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DonutCenterOptions extends StObject {
  
  /**
    * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called 'Show total'.
    */
  var LabelVisibility: js.UndefOr[Visibility] = js.undefined
}
object DonutCenterOptions {
  
  inline def apply(): DonutCenterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DonutCenterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DonutCenterOptions] (val x: Self) extends AnyVal {
    
    inline def setLabelVisibility(value: Visibility): Self = StObject.set(x, "LabelVisibility", value.asInstanceOf[js.Any])
    
    inline def setLabelVisibilityUndefined: Self = StObject.set(x, "LabelVisibility", js.undefined)
  }
}
