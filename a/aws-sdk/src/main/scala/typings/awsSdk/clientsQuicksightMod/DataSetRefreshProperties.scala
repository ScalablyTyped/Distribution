package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetRefreshProperties extends StObject {
  
  /**
    * The refresh configuration for a dataset.
    */
  var RefreshConfiguration: typings.awsSdk.clientsQuicksightMod.RefreshConfiguration
}
object DataSetRefreshProperties {
  
  inline def apply(RefreshConfiguration: RefreshConfiguration): DataSetRefreshProperties = {
    val __obj = js.Dynamic.literal(RefreshConfiguration = RefreshConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetRefreshProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSetRefreshProperties] (val x: Self) extends AnyVal {
    
    inline def setRefreshConfiguration(value: RefreshConfiguration): Self = StObject.set(x, "RefreshConfiguration", value.asInstanceOf[js.Any])
  }
}
