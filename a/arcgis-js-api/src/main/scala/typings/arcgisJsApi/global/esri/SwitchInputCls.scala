package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SwitchInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SwitchInput")
@js.native
/**
  * The `SwitchInput` class defines the desired user interface for a binary switch or toggle.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-SwitchInput.html)
  */
open class SwitchInputCls ()
  extends StObject
     with typings.arcgisJsApi.esri.SwitchInput {
  def this(properties: SwitchInputProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
