package typings.atlassianCrowdClient.settingsMod

import typings.atlassianCrowdClient.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  val application: Password = js.native
  
  val attributesEncoder: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.native
  
  val attributesParser: js.UndefOr[js.Function1[/* json */ String, _]] = js.native
  
  val baseUrl: String = js.native
  
  val debug: js.UndefOr[Boolean] = js.native
  
  val nesting: js.UndefOr[Boolean] = js.native
  
  val sessionTimeout: js.UndefOr[Double] = js.native
}
object Settings {
  
  @scala.inline
  def apply(application: Password, baseUrl: String): Settings = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Password): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesEncoder(value: /* obj */ js.Any => String): Self = this.set("attributesEncoder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttributesEncoder: Self = this.set("attributesEncoder", js.undefined)
    
    @scala.inline
    def setAttributesParser(value: /* json */ String => _): Self = this.set("attributesParser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttributesParser: Self = this.set("attributesParser", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setNesting(value: Boolean): Self = this.set("nesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNesting: Self = this.set("nesting", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: Double): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
  }
}
