package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`coded-value`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inherited
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.range
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
  var name: String = js.native
  /**
    * The domain type.  **Possible Values:** range | coded-value | inherited
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: range | `coded-value` | inherited = js.native
}

@JSGlobal("__esri.Domain")
@js.native
object Domain extends TopLevel[DomainConstructor]

