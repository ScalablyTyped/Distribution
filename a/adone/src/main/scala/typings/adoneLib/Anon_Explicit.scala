package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explicit extends js.Object {
  var explicit: js.UndefOr[js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]] = js.undefined
  var `implicit`: js.UndefOr[js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]]] = js.undefined
  var include: js.UndefOr[js.Array[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema]] = js.undefined
}

object Anon_Explicit {
  @scala.inline
  def apply(
    explicit: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]] = null,
    `implicit`: js.Array[adoneLib.adoneNs.dataNs.yamlNs.typeNs.Type[_]] = null,
    include: js.Array[adoneLib.adoneNs.dataNs.yamlNs.schemaNs.Schema] = null
  ): Anon_Explicit = {
    val __obj = js.Dynamic.literal()
    if (explicit != null) __obj.updateDynamic("explicit")(explicit)
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Anon_Explicit]
  }
}

