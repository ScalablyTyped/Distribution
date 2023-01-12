package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be deleted.
    */
  var HostArn: typings.awsSdk.clientsCodestarconnectionsMod.HostArn
}
object DeleteHostInput {
  
  inline def apply(HostArn: HostArn): DeleteHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHostInput] (val x: Self) extends AnyVal {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
  }
}
