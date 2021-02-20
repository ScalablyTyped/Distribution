package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentOptions extends StObject {
  
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
  implicit class UserAgentOptionsMutableBuilder[Self <: UserAgentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
