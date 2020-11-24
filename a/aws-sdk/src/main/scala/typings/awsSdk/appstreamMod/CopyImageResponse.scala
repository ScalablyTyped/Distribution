package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyImageResponse extends js.Object {
  
  /**
    * The name of the destination image.
    */
  var DestinationImageName: js.UndefOr[Name] = js.native
}
object CopyImageResponse {
  
  @scala.inline
  def apply(): CopyImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyImageResponse]
  }
  
  @scala.inline
  implicit class CopyImageResponseOps[Self <: CopyImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationImageName(value: Name): Self = this.set("DestinationImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationImageName: Self = this.set("DestinationImageName", js.undefined)
  }
}
