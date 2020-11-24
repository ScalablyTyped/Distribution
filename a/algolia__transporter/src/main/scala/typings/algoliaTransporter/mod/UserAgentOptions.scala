package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentOptions extends js.Object {
  
  /**
    * The segment. Usually the integration name.
    */
  val segment: String = js.native
  
  /**
    * The version. Usually the integration version.
    */
  val version: js.UndefOr[String] = js.native
}
object UserAgentOptions {
  
  @scala.inline
  def apply(segment: String): UserAgentOptions = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentOptions]
  }
  
  @scala.inline
  implicit class UserAgentOptionsOps[Self <: UserAgentOptions] (val x: Self) extends AnyVal {
    
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
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
