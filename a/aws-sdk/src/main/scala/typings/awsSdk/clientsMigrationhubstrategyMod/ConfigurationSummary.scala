package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSummary extends StObject {
  
  /**
    * IP address based configurations.
    */
  var ipAddressBasedRemoteInfoList: js.UndefOr[IPAddressBasedRemoteInfoList] = js.undefined
  
  /**
    * The list of pipeline info configurations.
    */
  var pipelineInfoList: js.UndefOr[PipelineInfoList] = js.undefined
  
  /**
    * Info about the remote server source code configuration.
    */
  var remoteSourceCodeAnalysisServerInfo: js.UndefOr[RemoteSourceCodeAnalysisServerInfo] = js.undefined
  
  /**
    * The list of vCenter configurations.
    */
  var vcenterBasedRemoteInfoList: js.UndefOr[VcenterBasedRemoteInfoList] = js.undefined
  
  /**
    * The list of the version control configurations.
    */
  var versionControlInfoList: js.UndefOr[VersionControlInfoList] = js.undefined
}
object ConfigurationSummary {
  
  inline def apply(): ConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationSummary] (val x: Self) extends AnyVal {
    
    inline def setIpAddressBasedRemoteInfoList(value: IPAddressBasedRemoteInfoList): Self = StObject.set(x, "ipAddressBasedRemoteInfoList", value.asInstanceOf[js.Any])
    
    inline def setIpAddressBasedRemoteInfoListUndefined: Self = StObject.set(x, "ipAddressBasedRemoteInfoList", js.undefined)
    
    inline def setIpAddressBasedRemoteInfoListVarargs(value: IPAddressBasedRemoteInfo*): Self = StObject.set(x, "ipAddressBasedRemoteInfoList", js.Array(value*))
    
    inline def setPipelineInfoList(value: PipelineInfoList): Self = StObject.set(x, "pipelineInfoList", value.asInstanceOf[js.Any])
    
    inline def setPipelineInfoListUndefined: Self = StObject.set(x, "pipelineInfoList", js.undefined)
    
    inline def setPipelineInfoListVarargs(value: PipelineInfo*): Self = StObject.set(x, "pipelineInfoList", js.Array(value*))
    
    inline def setRemoteSourceCodeAnalysisServerInfo(value: RemoteSourceCodeAnalysisServerInfo): Self = StObject.set(x, "remoteSourceCodeAnalysisServerInfo", value.asInstanceOf[js.Any])
    
    inline def setRemoteSourceCodeAnalysisServerInfoUndefined: Self = StObject.set(x, "remoteSourceCodeAnalysisServerInfo", js.undefined)
    
    inline def setVcenterBasedRemoteInfoList(value: VcenterBasedRemoteInfoList): Self = StObject.set(x, "vcenterBasedRemoteInfoList", value.asInstanceOf[js.Any])
    
    inline def setVcenterBasedRemoteInfoListUndefined: Self = StObject.set(x, "vcenterBasedRemoteInfoList", js.undefined)
    
    inline def setVcenterBasedRemoteInfoListVarargs(value: VcenterBasedRemoteInfo*): Self = StObject.set(x, "vcenterBasedRemoteInfoList", js.Array(value*))
    
    inline def setVersionControlInfoList(value: VersionControlInfoList): Self = StObject.set(x, "versionControlInfoList", value.asInstanceOf[js.Any])
    
    inline def setVersionControlInfoListUndefined: Self = StObject.set(x, "versionControlInfoList", js.undefined)
    
    inline def setVersionControlInfoListVarargs(value: VersionControlInfo*): Self = StObject.set(x, "versionControlInfoList", js.Array(value*))
  }
}
