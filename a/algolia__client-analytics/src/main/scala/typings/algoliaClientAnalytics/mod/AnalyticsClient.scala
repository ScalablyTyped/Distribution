package typings.algoliaClientAnalytics.mod

import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsClient extends js.Object {
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
object AnalyticsClient {
  
  @scala.inline
  def apply(appId: String, transporter: Transporter): AnalyticsClient = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsClient]
  }
  
  @scala.inline
  implicit class AnalyticsClientOps[Self <: AnalyticsClient] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransporter(value: Transporter): Self = this.set("transporter", value.asInstanceOf[js.Any])
  }
}
