package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QopConfiguration extends StObject {
  
  /**
    * The data transfer protection setting configured on the HDFS cluster. This setting corresponds to your dfs.data.transfer.protection setting in the hdfs-site.xml file on your Hadoop cluster.
    */
  var DataTransferProtection: js.UndefOr[HdfsDataTransferProtection] = js.undefined
  
  /**
    * The RPC protection setting configured on the HDFS cluster. This setting corresponds to your hadoop.rpc.protection setting in your core-site.xml file on your Hadoop cluster.
    */
  var RpcProtection: js.UndefOr[HdfsRpcProtection] = js.undefined
}
object QopConfiguration {
  
  inline def apply(): QopConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QopConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QopConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataTransferProtection(value: HdfsDataTransferProtection): Self = StObject.set(x, "DataTransferProtection", value.asInstanceOf[js.Any])
    
    inline def setDataTransferProtectionUndefined: Self = StObject.set(x, "DataTransferProtection", js.undefined)
    
    inline def setRpcProtection(value: HdfsRpcProtection): Self = StObject.set(x, "RpcProtection", value.asInstanceOf[js.Any])
    
    inline def setRpcProtectionUndefined: Self = StObject.set(x, "RpcProtection", js.undefined)
  }
}
