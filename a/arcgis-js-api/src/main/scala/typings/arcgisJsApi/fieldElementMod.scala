package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldElement
import typings.arcgisJsApi.esri.FieldElementConstructor
import typings.arcgisJsApi.esri.FieldElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldElementMod extends Shortcut {
  
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FieldElementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/FieldElement", JSImport.Namespace)
  @js.native
  /**
    * A `FieldElement` form element defines how a feature layer's [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html)
    */
  class Class ()
    extends StObject
       with FieldElement {
    def this(properties: FieldElementProperties) = this()
    
    /**
      * The element's description providing the purpose behind it.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#description)
      */
    /* CompleteClass */
    var description: String = js.native
    
    /**
      * A string value containing the field alias.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#label)
      */
    /* CompleteClass */
    var label: String = js.native
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /**
      * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#visibilityExpression)
      */
    /* CompleteClass */
    var visibilityExpression: String = js.native
  }
  
  type _To = js.Object & FieldElementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldElementMod.foo` */
  override def _to: js.Object & FieldElementConstructor = ^
}
