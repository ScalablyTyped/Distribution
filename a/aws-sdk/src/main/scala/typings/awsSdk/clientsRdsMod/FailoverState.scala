package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverState extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being demoted, and which is associated with this state.
    */
  var FromDbClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the Aurora global database (GlobalCluster). Possible values are as follows:   pending &#x96; A request to fail over the Aurora global database (GlobalCluster) has been received by the service. The GlobalCluster's primary DB cluster and the specified secondary DB cluster are being verified before the failover process can start.   failing-over &#x96; This status covers the range of Aurora internal operations that take place during the failover process, such as demoting the primary Aurora DB cluster, promoting the secondary Aurora DB, and synchronizing replicas.   cancelling &#x96; The request to fail over the Aurora global database (GlobalCluster) was cancelled and the primary Aurora DB cluster and the selected secondary Aurora DB cluster are returning to their previous states.  
    */
  var Status: js.UndefOr[FailoverStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora DB cluster that is currently being promoted, and which is associated with this state.
    */
  var ToDbClusterArn: js.UndefOr[String] = js.undefined
}
object FailoverState {
  
  inline def apply(): FailoverState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverState]
  }
  
  extension [Self <: FailoverState](x: Self) {
    
    inline def setFromDbClusterArn(value: String): Self = StObject.set(x, "FromDbClusterArn", value.asInstanceOf[js.Any])
    
    inline def setFromDbClusterArnUndefined: Self = StObject.set(x, "FromDbClusterArn", js.undefined)
    
    inline def setStatus(value: FailoverStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setToDbClusterArn(value: String): Self = StObject.set(x, "ToDbClusterArn", value.asInstanceOf[js.Any])
    
    inline def setToDbClusterArnUndefined: Self = StObject.set(x, "ToDbClusterArn", js.undefined)
  }
}
