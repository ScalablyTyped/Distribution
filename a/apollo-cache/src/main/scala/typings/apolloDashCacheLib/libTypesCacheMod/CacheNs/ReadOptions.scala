package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReadOptions[TVariables]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables] {
  var optimistic: scala.Boolean
  var previousResult: js.UndefOr[js.Any] = js.undefined
  var rootId: js.UndefOr[java.lang.String] = js.undefined
}

