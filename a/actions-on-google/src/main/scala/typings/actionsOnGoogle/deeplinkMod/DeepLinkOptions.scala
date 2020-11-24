package typings.actionsOnGoogle.deeplinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepLinkOptions extends js.Object {
  
  /**
    * Android app package name to which to link.
    * @public
    */
  @JSName("package")
  var _package: String = js.native
  
  /**
    * The name of the link destination.
    * @public
    */
  var destination: String = js.native
  
  /**
    * The reason to transfer the user. This may be appended to a Google-specified prompt.
    * @public
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * URL of Android deep link.
    * @public
    */
  var url: String = js.native
}
object DeepLinkOptions {
  
  @scala.inline
  def apply(_package: String, destination: String, url: String): DeepLinkOptions = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepLinkOptions]
  }
  
  @scala.inline
  implicit class DeepLinkOptionsOps[Self <: DeepLinkOptions] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
