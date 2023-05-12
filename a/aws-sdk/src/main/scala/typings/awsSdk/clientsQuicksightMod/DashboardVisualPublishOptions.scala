package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardVisualPublishOptions extends StObject {
  
  /**
    * Determines if hidden fields are included in an exported dashboard.
    */
  var ExportHiddenFieldsOption: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ExportHiddenFieldsOption] = js.undefined
}
object DashboardVisualPublishOptions {
  
  inline def apply(): DashboardVisualPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardVisualPublishOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardVisualPublishOptions] (val x: Self) extends AnyVal {
    
    inline def setExportHiddenFieldsOption(value: ExportHiddenFieldsOption): Self = StObject.set(x, "ExportHiddenFieldsOption", value.asInstanceOf[js.Any])
    
    inline def setExportHiddenFieldsOptionUndefined: Self = StObject.set(x, "ExportHiddenFieldsOption", js.undefined)
  }
}
