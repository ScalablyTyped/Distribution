package typings.arcgisJsApi.esri

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeExtent
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    */
  var end: Date = js.native
  
  /**
    * Returns the time extent resulting from the intersection of a given time extent and parsed time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    */
  def intersection(timeExtent: TimeExtent): TimeExtent = js.native
  
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    */
  var start: Date = js.native
}
