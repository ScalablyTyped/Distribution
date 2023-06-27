package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateItemConstructor
  extends StObject
     with Instantiable0[TemplateItem]
     with Instantiable1[/* properties */ TemplateItemProperties, TemplateItem] {
  
  /**
  		 * Fetches the thumbnail used to display the template item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#fetchThumbnail)
  		 */
  def fetchThumbnail(): js.Promise[Any] = js.native
}
