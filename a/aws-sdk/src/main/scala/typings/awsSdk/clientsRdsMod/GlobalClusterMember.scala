package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalClusterMember extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for each Aurora cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a secondary cluster in an Aurora global database has write forwarding enabled, not enabled, or is in the process of enabling it.
    */
  var GlobalWriteForwardingStatus: js.UndefOr[WriteForwardingStatus] = js.undefined
  
  /**
    * Specifies whether the Aurora cluster is the primary cluster (that is, has read-write capability) for the Aurora global database with which it is associated.
    */
  var IsWriter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the Aurora global database.
    */
  var Readers: js.UndefOr[ReadersArnList] = js.undefined
}
object GlobalClusterMember {
  
  inline def apply(): GlobalClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClusterMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalClusterMember] (val x: Self) extends AnyVal {
    
    inline def setDBClusterArn(value: String): Self = StObject.set(x, "DBClusterArn", value.asInstanceOf[js.Any])
    
    inline def setDBClusterArnUndefined: Self = StObject.set(x, "DBClusterArn", js.undefined)
    
    inline def setGlobalWriteForwardingStatus(value: WriteForwardingStatus): Self = StObject.set(x, "GlobalWriteForwardingStatus", value.asInstanceOf[js.Any])
    
    inline def setGlobalWriteForwardingStatusUndefined: Self = StObject.set(x, "GlobalWriteForwardingStatus", js.undefined)
    
    inline def setIsWriter(value: Boolean): Self = StObject.set(x, "IsWriter", value.asInstanceOf[js.Any])
    
    inline def setIsWriterUndefined: Self = StObject.set(x, "IsWriter", js.undefined)
    
    inline def setReaders(value: ReadersArnList): Self = StObject.set(x, "Readers", value.asInstanceOf[js.Any])
    
    inline def setReadersUndefined: Self = StObject.set(x, "Readers", js.undefined)
    
    inline def setReadersVarargs(value: String*): Self = StObject.set(x, "Readers", js.Array(value*))
  }
}
