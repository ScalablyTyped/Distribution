package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisDefaults extends StObject {
  
  /**
    * The configuration for default new sheet settings.
    */
  var DefaultNewSheetConfiguration: typings.awsSdk.clientsQuicksightMod.DefaultNewSheetConfiguration
}
object AnalysisDefaults {
  
  inline def apply(DefaultNewSheetConfiguration: DefaultNewSheetConfiguration): AnalysisDefaults = {
    val __obj = js.Dynamic.literal(DefaultNewSheetConfiguration = DefaultNewSheetConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisDefaults] (val x: Self) extends AnyVal {
    
    inline def setDefaultNewSheetConfiguration(value: DefaultNewSheetConfiguration): Self = StObject.set(x, "DefaultNewSheetConfiguration", value.asInstanceOf[js.Any])
  }
}
