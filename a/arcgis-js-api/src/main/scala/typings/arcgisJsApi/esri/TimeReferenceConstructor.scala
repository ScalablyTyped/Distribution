package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeReferenceConstructor
  extends StObject
     with /**
  * TimeReference contains information about how the time was captured when the data was created.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html)
  */
Instantiable0[TimeReference]
     with Instantiable1[/* properties */ TimeReferenceProperties, TimeReference] {
  
  def fromJSON(json: Any): TimeReference = js.native
}
