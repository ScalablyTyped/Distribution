package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GroupElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GroupElement")
@js.native
/**
  * A `GroupElement` form element defines a container that holds a set of [form elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements) that can be expanded, collapsed, or displayed together.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html)
  */
open class GroupElement ()
  extends StObject
     with typings.arcgisJsApi.esri.GroupElement {
  def this(properties: GroupElementProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GroupElement {
  
  @JSGlobal("__esri.GroupElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GroupElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GroupElement]
}
