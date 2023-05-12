package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layout extends StObject {
  
  /**
    * The configuration that determines what the type of layout for a sheet.
    */
  var Configuration: LayoutConfiguration
}
object Layout {
  
  inline def apply(Configuration: LayoutConfiguration): Layout = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: LayoutConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
  }
}
