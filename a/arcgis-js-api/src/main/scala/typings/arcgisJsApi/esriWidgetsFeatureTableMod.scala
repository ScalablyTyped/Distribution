package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureTable
import typings.arcgisJsApi.esri.FeatureTableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureTableMod {
  
  @JSImport("esri/widgets/FeatureTable", JSImport.Namespace)
  @js.native
  /**
  		 * This widget provides an interactive tabular view of each feature's attributes in a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html)
  		 */
  open class ^ ()
    extends StObject
       with FeatureTable {
    def this(properties: FeatureTableProperties) = this()
  }
}
