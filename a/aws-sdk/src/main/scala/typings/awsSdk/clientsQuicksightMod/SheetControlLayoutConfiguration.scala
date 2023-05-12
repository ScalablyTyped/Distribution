package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetControlLayoutConfiguration extends StObject {
  
  /**
    * The configuration that determines the elements and canvas size options of sheet control.
    */
  var GridLayout: js.UndefOr[GridLayoutConfiguration] = js.undefined
}
object SheetControlLayoutConfiguration {
  
  inline def apply(): SheetControlLayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetControlLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetControlLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGridLayout(value: GridLayoutConfiguration): Self = StObject.set(x, "GridLayout", value.asInstanceOf[js.Any])
    
    inline def setGridLayoutUndefined: Self = StObject.set(x, "GridLayout", js.undefined)
  }
}
