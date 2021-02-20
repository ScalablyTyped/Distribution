package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeouts extends StObject {
  
  /**
    * The timeout to stablish a connection with the server.
    */
  val connect: Double = js.native
  
  /**
    * The timeout to receive the response on read requests.
    */
  val read: Double = js.native
  
  /**
    * The timeout to receive the response on write requests.
    */
  val write: Double = js.native
}
object Timeouts {
  
  @scala.inline
  def apply(connect: Double, read: Double, write: Double): Timeouts = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeouts]
  }
  
  @scala.inline
  implicit class TimeoutsMutableBuilder[Self <: Timeouts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect(value: Double): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Double): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Double): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
