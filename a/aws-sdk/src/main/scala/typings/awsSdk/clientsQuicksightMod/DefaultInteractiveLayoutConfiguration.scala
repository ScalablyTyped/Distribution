package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInteractiveLayoutConfiguration extends StObject {
  
  /**
    * The options that determine the default settings of a free-form layout configuration.
    */
  var FreeForm: js.UndefOr[DefaultFreeFormLayoutConfiguration] = js.undefined
  
  /**
    * The options that determine the default settings for a grid layout configuration.
    */
  var Grid: js.UndefOr[DefaultGridLayoutConfiguration] = js.undefined
}
object DefaultInteractiveLayoutConfiguration {
  
  inline def apply(): DefaultInteractiveLayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultInteractiveLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultInteractiveLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFreeForm(value: DefaultFreeFormLayoutConfiguration): Self = StObject.set(x, "FreeForm", value.asInstanceOf[js.Any])
    
    inline def setFreeFormUndefined: Self = StObject.set(x, "FreeForm", js.undefined)
    
    inline def setGrid(value: DefaultGridLayoutConfiguration): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "Grid", js.undefined)
  }
}
