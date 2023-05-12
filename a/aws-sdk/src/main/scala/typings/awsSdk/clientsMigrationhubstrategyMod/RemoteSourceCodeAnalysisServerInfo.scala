package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteSourceCodeAnalysisServerInfo extends StObject {
  
  /**
    * The time when the remote source code server was configured.
    */
  var remoteSourceCodeAnalysisServerConfigurationTimestamp: js.UndefOr[String] = js.undefined
}
object RemoteSourceCodeAnalysisServerInfo {
  
  inline def apply(): RemoteSourceCodeAnalysisServerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteSourceCodeAnalysisServerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteSourceCodeAnalysisServerInfo] (val x: Self) extends AnyVal {
    
    inline def setRemoteSourceCodeAnalysisServerConfigurationTimestamp(value: String): Self = StObject.set(x, "remoteSourceCodeAnalysisServerConfigurationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRemoteSourceCodeAnalysisServerConfigurationTimestampUndefined: Self = StObject.set(x, "remoteSourceCodeAnalysisServerConfigurationTimestamp", js.undefined)
  }
}
