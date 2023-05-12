package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionLayoutConfiguration extends StObject {
  
  /**
    * The free-form layout configuration of a section.
    */
  var FreeFormLayout: FreeFormSectionLayoutConfiguration
}
object SectionLayoutConfiguration {
  
  inline def apply(FreeFormLayout: FreeFormSectionLayoutConfiguration): SectionLayoutConfiguration = {
    val __obj = js.Dynamic.literal(FreeFormLayout = FreeFormLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFreeFormLayout(value: FreeFormSectionLayoutConfiguration): Self = StObject.set(x, "FreeFormLayout", value.asInstanceOf[js.Any])
  }
}
