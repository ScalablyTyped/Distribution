package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BarcodeScannerInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.BarcodeScannerInput")
@js.native
/**
  * The `BarcodeScannerInput` class defines the desired user interface for a barcode or QR code scanner.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-BarcodeScannerInput.html)
  */
open class BarcodeScannerInputCls ()
  extends StObject
     with typings.arcgisJsApi.esri.BarcodeScannerInput {
  def this(properties: BarcodeScannerInputProperties) = this()
  
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
