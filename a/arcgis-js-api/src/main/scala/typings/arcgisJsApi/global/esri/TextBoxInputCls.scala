package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TextBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.TextBoxInput")
@js.native
/**
  * The `TextBoxInput` class defines the desired user interface as a single-line text box.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextBoxInput.html)
  */
open class TextBoxInputCls ()
  extends StObject
     with typings.arcgisJsApi.esri.TextBoxInput {
  def this(properties: TextBoxInputProperties) = this()
  
  /**
    * When set, defines the text input's maximum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
    */
  /* CompleteClass */
  var maxLength: Double = js.native
  
  /**
    * When set, defines the text input's minimum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
    */
  /* CompleteClass */
  var minLength: Double = js.native
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
