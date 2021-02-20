package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
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
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setIconURL(value: String): Self = StObject.set(x, "IconURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconURLUndefined: Self = StObject.set(x, "IconURL", js.undefined)
    
    @scala.inline
    def setLaunchParameters(value: String): Self = StObject.set(x, "LaunchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchParametersUndefined: Self = StObject.set(x, "LaunchParameters", js.undefined)
    
    @scala.inline
    def setLaunchPath(value: String): Self = StObject.set(x, "LaunchPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchPathUndefined: Self = StObject.set(x, "LaunchPath", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
