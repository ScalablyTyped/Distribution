package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsPendingCloudWatchLogsExports extends StObject {
  
  /**
    * A list of log types that are being disabled.
    */
  var LogTypesToDisable: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of log types that are being enabled.
    */
  var LogTypesToEnable: js.UndefOr[StringList] = js.undefined
}
object AwsRdsPendingCloudWatchLogsExports {
  
  inline def apply(): AwsRdsPendingCloudWatchLogsExports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsPendingCloudWatchLogsExports]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsPendingCloudWatchLogsExports] (val x: Self) extends AnyVal {
    
    inline def setLogTypesToDisable(value: StringList): Self = StObject.set(x, "LogTypesToDisable", value.asInstanceOf[js.Any])
    
    inline def setLogTypesToDisableUndefined: Self = StObject.set(x, "LogTypesToDisable", js.undefined)
    
    inline def setLogTypesToDisableVarargs(value: NonEmptyString*): Self = StObject.set(x, "LogTypesToDisable", js.Array(value*))
    
    inline def setLogTypesToEnable(value: StringList): Self = StObject.set(x, "LogTypesToEnable", value.asInstanceOf[js.Any])
    
    inline def setLogTypesToEnableUndefined: Self = StObject.set(x, "LogTypesToEnable", js.undefined)
    
    inline def setLogTypesToEnableVarargs(value: NonEmptyString*): Self = StObject.set(x, "LogTypesToEnable", js.Array(value*))
  }
}
