package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeouts extends js.Object {
  
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
  implicit class TimeoutsOps[Self <: Timeouts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnect(value: Double): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: Double): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Double): Self = this.set("write", value.asInstanceOf[js.Any])
  }
}
