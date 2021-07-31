package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewConstructor
  extends StObject
     with /**
  * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
  */
Instantiable0[View]
     with Instantiable1[/* properties */ ViewProperties, View] {
  
  /**
    * Contains the collection of active views on the page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#views)
    */
  val views: Collection[View] = js.native
}
