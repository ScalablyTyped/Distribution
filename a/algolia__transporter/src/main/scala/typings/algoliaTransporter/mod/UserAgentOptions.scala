package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAgentOptions extends StObject {
  
  /**
    * The segment. Usually the integration name.
    */
  val segment: String
  
  /**
    * The version. Usually the integration version.
    */
  val version: js.UndefOr[String] = js.undefined
}
object UserAgentOptions {
  
  inline def apply(segment: String): UserAgentOptions = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentOptions]
  }
  
  extension [Self <: UserAgentOptions](x: Self) {
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
