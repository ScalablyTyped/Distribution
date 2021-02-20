package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CSVLayer
import typings.arcgisJsApi.esri.CSVLayerConstructor
import typings.arcgisJsApi.esri.CSVLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csvlayerMod extends Shortcut {
  
  @JSImport("esri/layers/CSVLayer", JSImport.Namespace)
  @js.native
  val ^ : CSVLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/CSVLayer", JSImport.Namespace)
  @js.native
  /**
    * The CSVLayer is a point layer based on a CSV file (.csv, .txt).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html)
    */
  class Class () extends CSVLayer {
    def this(properties: CSVLayerProperties) = this()
  }
  
  type _To = CSVLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `csvlayerMod.foo` */
  override def _to: CSVLayerConstructor = ^
}
