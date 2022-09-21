package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeIntervalConstructor
  extends StObject
     with /**
  * TimeInterval is a class that describes a length of time in one of ten temporal units such as seconds, days, or years.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html)
  */
Instantiable0[TimeInterval]
     with Instantiable1[/* properties */ TimeIntervalProperties, TimeInterval] {
  
  def fromJSON(json: Any): TimeInterval = js.native
}
