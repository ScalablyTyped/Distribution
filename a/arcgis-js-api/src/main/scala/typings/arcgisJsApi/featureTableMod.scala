package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureTable
import typings.arcgisJsApi.esri.FeatureTableConstructor
import typings.arcgisJsApi.esri.FeatureTableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTableMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureTableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable", JSImport.Namespace)
  @js.native
  /**
    * This widget provides an interactive tabular view of each feature's attributes in a feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html)
    */
  class Class ()
    extends StObject
       with FeatureTable {
    def this(properties: FeatureTableProperties) = this()
  }
  
  type _To = js.Object & FeatureTableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTableMod.foo` */
  override def _to: js.Object & FeatureTableConstructor = ^
}
