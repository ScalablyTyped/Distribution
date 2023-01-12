package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.atlassianConnectJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: `true`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(binaryAttachment = true)
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setBinaryAttachment(value: `true`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
  }
}
