package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultNewSheetConfiguration extends StObject {
  
  /**
    * The options that determine the default settings for interactive layout configuration.
    */
  var InteractiveLayoutConfiguration: js.UndefOr[DefaultInteractiveLayoutConfiguration] = js.undefined
  
  /**
    * The options that determine the default settings for a paginated layout configuration.
    */
  var PaginatedLayoutConfiguration: js.UndefOr[DefaultPaginatedLayoutConfiguration] = js.undefined
  
  /**
    * The option that determines the sheet content type.
    */
  var SheetContentType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SheetContentType] = js.undefined
}
object DefaultNewSheetConfiguration {
  
  inline def apply(): DefaultNewSheetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultNewSheetConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultNewSheetConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInteractiveLayoutConfiguration(value: DefaultInteractiveLayoutConfiguration): Self = StObject.set(x, "InteractiveLayoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInteractiveLayoutConfigurationUndefined: Self = StObject.set(x, "InteractiveLayoutConfiguration", js.undefined)
    
    inline def setPaginatedLayoutConfiguration(value: DefaultPaginatedLayoutConfiguration): Self = StObject.set(x, "PaginatedLayoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPaginatedLayoutConfigurationUndefined: Self = StObject.set(x, "PaginatedLayoutConfiguration", js.undefined)
    
    inline def setSheetContentType(value: SheetContentType): Self = StObject.set(x, "SheetContentType", value.asInstanceOf[js.Any])
    
    inline def setSheetContentTypeUndefined: Self = StObject.set(x, "SheetContentType", js.undefined)
  }
}
