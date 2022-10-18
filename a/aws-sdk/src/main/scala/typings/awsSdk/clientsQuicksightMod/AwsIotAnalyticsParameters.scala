package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIotAnalyticsParameters extends StObject {
  
  /**
    * Dataset name.
    */
  var DataSetName: typings.awsSdk.clientsQuicksightMod.DataSetName
}
object AwsIotAnalyticsParameters {
  
  inline def apply(DataSetName: DataSetName): AwsIotAnalyticsParameters = {
    val __obj = js.Dynamic.literal(DataSetName = DataSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIotAnalyticsParameters]
  }
  
  extension [Self <: AwsIotAnalyticsParameters](x: Self) {
    
    inline def setDataSetName(value: DataSetName): Self = StObject.set(x, "DataSetName", value.asInstanceOf[js.Any])
  }
}
