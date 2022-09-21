package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentInfoConstructor
  extends StObject
     with /**
  * The `AttachmentInfo` class returns information about attachments associated with a feature.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html)
  */
Instantiable0[AttachmentInfo]
     with Instantiable1[/* properties */ AttachmentInfoProperties, AttachmentInfo] {
  
  def fromJSON(json: Any): AttachmentInfo = js.native
}
