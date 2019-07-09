package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain
  extends Accessor
     with JSONSupport {
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * The domain type.  **Possible Values:** range | coded-value | inherited
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.range | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`coded-value` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inherited = js.native
}

@JSGlobal("__esri.Domain")
@js.native
class DomainCls () extends Domain {
  def this(properties: DomainProperties) = this()
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

