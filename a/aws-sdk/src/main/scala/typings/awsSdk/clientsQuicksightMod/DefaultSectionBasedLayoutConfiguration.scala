package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSectionBasedLayoutConfiguration extends StObject {
  
  /**
    * Determines the screen canvas size options for a section-based layout.
    */
  var CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions
}
object DefaultSectionBasedLayoutConfiguration {
  
  inline def apply(CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions): DefaultSectionBasedLayoutConfiguration = {
    val __obj = js.Dynamic.literal(CanvasSizeOptions = CanvasSizeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSectionBasedLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultSectionBasedLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCanvasSizeOptions(value: SectionBasedLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
  }
}
