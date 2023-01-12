package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPreviewResponse extends StObject {
  
  /**
    * An object that contains information about the access preview.
    */
  var accessPreview: AccessPreview
}
object GetAccessPreviewResponse {
  
  inline def apply(accessPreview: AccessPreview): GetAccessPreviewResponse = {
    val __obj = js.Dynamic.literal(accessPreview = accessPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPreviewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPreviewResponse] (val x: Self) extends AnyVal {
    
    inline def setAccessPreview(value: AccessPreview): Self = StObject.set(x, "accessPreview", value.asInstanceOf[js.Any])
  }
}
