package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeExtentConstructor
  extends StObject
     with /**
  * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
  */
Instantiable0[TimeExtent]
     with Instantiable1[/* properties */ TimeExtentProperties, TimeExtent] {
  
  def fromJSON(json: js.Any): TimeExtent = js.native
}
