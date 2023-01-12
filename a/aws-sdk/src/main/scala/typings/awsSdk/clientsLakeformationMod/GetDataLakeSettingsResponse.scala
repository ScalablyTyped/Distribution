package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataLakeSettingsResponse extends StObject {
  
  /**
    * A structure representing a list of Lake Formation principals designated as data lake administrators.
    */
  var DataLakeSettings: js.UndefOr[typings.awsSdk.clientsLakeformationMod.DataLakeSettings] = js.undefined
}
object GetDataLakeSettingsResponse {
  
  inline def apply(): GetDataLakeSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataLakeSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataLakeSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataLakeSettings(value: DataLakeSettings): Self = StObject.set(x, "DataLakeSettings", value.asInstanceOf[js.Any])
    
    inline def setDataLakeSettingsUndefined: Self = StObject.set(x, "DataLakeSettings", js.undefined)
  }
}
