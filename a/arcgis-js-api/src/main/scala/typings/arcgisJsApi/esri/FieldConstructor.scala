package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldConstructor
  extends StObject
     with /**
  * Information about each field in a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html)
  */
Instantiable0[Field]
     with Instantiable1[/* properties */ FieldProperties, Field] {
  
  def fromJSON(json: Any): Field = js.native
}
