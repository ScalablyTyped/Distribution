package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GroupElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GroupElement")
@js.native
/**
  * A `GroupElement` form element defines a container that holds a set of [form elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements) that can be expanded, collapsed, or displayed together.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html)
  */
class GroupElementCls ()
  extends StObject
     with typings.arcgisJsApi.esri.GroupElement {
  def this(properties: GroupElementProperties) = this()
  
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
