package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalClusterMessage extends StObject {
  
  /**
    * The cluster identifier of the global cluster being deleted.
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsDocdbMod.GlobalClusterIdentifier
}
object DeleteGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
