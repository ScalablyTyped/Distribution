package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlobOutput extends StObject {
  
  /**
    * The content of the blob, usually a file.
    */
  var content: blob
}
object GetBlobOutput {
  
  inline def apply(content: blob): GetBlobOutput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlobOutput] (val x: Self) extends AnyVal {
    
    inline def setContent(value: blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
