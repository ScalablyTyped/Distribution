package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileInfoConstructor
  extends Instantiable0[TileInfo]
     with Instantiable1[/* properties */ TileInfoProperties, TileInfo] {
  
  /**
    * A convenience method used to create a new TileInfo instance with preset properties like [LODs](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#create)
    */
  def create(): TileInfo = js.native
  def create(options: TileInfoCreateOptions): TileInfo = js.native
  
  def fromJSON(json: js.Any): TileInfo = js.native
}
