package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldColumn
import typings.arcgisJsApi.esri.FieldColumnConstructor
import typings.arcgisJsApi.esri.FieldColumnProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldColumnMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/FieldColumn", JSImport.Namespace)
  @js.native
  val ^ : FieldColumnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/FieldColumn", JSImport.Namespace)
  @js.native
  /**
    * The [FieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) class works with the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) and provides the underlying logic for column behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html)
    */
  class Class () extends FieldColumn {
    def this(properties: FieldColumnProperties) = this()
  }
  
  type _To = FieldColumnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldColumnMod.foo` */
  override def _to: FieldColumnConstructor = ^
}
