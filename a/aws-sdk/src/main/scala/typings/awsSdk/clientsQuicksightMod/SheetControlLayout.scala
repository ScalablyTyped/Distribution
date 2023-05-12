package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetControlLayout extends StObject {
  
  /**
    * The configuration that determines the elements and canvas size options of sheet control.
    */
  var Configuration: SheetControlLayoutConfiguration
}
object SheetControlLayout {
  
  inline def apply(Configuration: SheetControlLayoutConfiguration): SheetControlLayout = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetControlLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetControlLayout] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: SheetControlLayoutConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
  }
}
