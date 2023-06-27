package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeotriggersInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * A list of Geotriggers.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-GeotriggersInfo.html#geotriggers)
  		 */
  var geotriggers: js.Array[Geotrigger] = js.native
}
