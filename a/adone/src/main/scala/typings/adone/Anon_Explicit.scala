package typings.adone

import typings.adone.adoneNs.dataNs.yamlNs.schemaNs.Schema
import typings.adone.adoneNs.dataNs.yamlNs.typeNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explicit extends js.Object {
  var explicit: js.UndefOr[js.Array[Type[_]]] = js.undefined
  var `implicit`: js.UndefOr[js.Array[Type[_]]] = js.undefined
  var include: js.UndefOr[js.Array[Schema]] = js.undefined
}

object Anon_Explicit {
  @scala.inline
  def apply(
    explicit: js.Array[Type[_]] = null,
    `implicit`: js.Array[Type[_]] = null,
    include: js.Array[Schema] = null
  ): Anon_Explicit = {
    val __obj = js.Dynamic.literal()
    if (explicit != null) __obj.updateDynamic("explicit")(explicit)
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Anon_Explicit]
  }
}

