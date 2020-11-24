package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends js.Object {
  
  /**
    * The application name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * If there is a problem, the application can be disabled after image creation.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The URL for the application icon. This URL might be time-limited.
    */
  var IconURL: js.UndefOr[String] = js.native
  
  /**
    * The arguments that are passed to the application at launch.
    */
  var LaunchParameters: js.UndefOr[String] = js.native
  
  /**
    * The path to the application executable in the instance.
    */
  var LaunchPath: js.UndefOr[String] = js.native
  
  /**
    * Additional attributes that describe the application.
    */
  var Metadata: js.UndefOr[typings.awsSdk.appstreamMod.Metadata] = js.native
  
  /**
    * The name of the application.
    */
  var Name: js.UndefOr[String] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setIconURL(value: String): Self = this.set("IconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconURL: Self = this.set("IconURL", js.undefined)
    
    @scala.inline
    def setLaunchParameters(value: String): Self = this.set("LaunchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchParameters: Self = this.set("LaunchParameters", js.undefined)
    
    @scala.inline
    def setLaunchPath(value: String): Self = this.set("LaunchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchPath: Self = this.set("LaunchPath", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
