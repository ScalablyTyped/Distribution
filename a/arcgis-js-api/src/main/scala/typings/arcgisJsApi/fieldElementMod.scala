package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldElement
import typings.arcgisJsApi.esri.FieldElementConstructor
import typings.arcgisJsApi.esri.FieldElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldElementMod extends Shortcut {
  
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  val ^ : FieldElementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  /**
    * A `FieldElement` form element defines how a feature layer's [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html)
    */
  class Class () extends FieldElement {
    def this(properties: FieldElementProperties) = this()
  }
  
  type _To = FieldElementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldElementMod.foo` */
  override def _to: FieldElementConstructor = ^
}
