package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPaginatedLayoutConfiguration extends StObject {
  
  /**
    * The options that determine the default settings for a section-based layout configuration.
    */
  var SectionBased: js.UndefOr[DefaultSectionBasedLayoutConfiguration] = js.undefined
}
object DefaultPaginatedLayoutConfiguration {
  
  inline def apply(): DefaultPaginatedLayoutConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPaginatedLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPaginatedLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSectionBased(value: DefaultSectionBasedLayoutConfiguration): Self = StObject.set(x, "SectionBased", value.asInstanceOf[js.Any])
    
    inline def setSectionBasedUndefined: Self = StObject.set(x, "SectionBased", js.undefined)
  }
}
