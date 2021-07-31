package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClassConstructor
  extends StObject
     with /**
  * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
  */
Instantiable0[LabelClass]
     with Instantiable1[/* properties */ LabelClassProperties, LabelClass] {
  
  def fromJSON(json: js.Any): LabelClass = js.native
}
