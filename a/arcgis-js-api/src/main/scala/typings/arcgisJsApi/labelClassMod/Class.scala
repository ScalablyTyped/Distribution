package typings.arcgisJsApi.labelClassMod

import typings.arcgisJsApi.esri.LabelClass
import typings.arcgisJsApi.esri.LabelClassProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
@js.native
/**
  * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
  */
class Class () extends LabelClass {
  def this(properties: LabelClassProperties) = this()
}
