package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InheritedDomain extends Domain {
  /**
    * The domain type. This value is always `inherited`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html#type)
    */
  @JSName("type")
  val type_InheritedDomain: inherited = js.native
}

@JSGlobal("__esri.InheritedDomain")
@js.native
class InheritedDomainCls () extends InheritedDomain {
  def this(properties: InheritedDomainProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

