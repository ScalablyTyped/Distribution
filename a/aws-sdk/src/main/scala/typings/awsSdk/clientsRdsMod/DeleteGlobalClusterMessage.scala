package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalClusterMessage extends StObject {
  
  /**
    * The cluster identifier of the global database cluster being deleted.
    */
  var GlobalClusterIdentifier: String
}
object DeleteGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: String): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
