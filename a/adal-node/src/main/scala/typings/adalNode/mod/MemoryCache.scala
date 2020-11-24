package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "MemoryCache")
@js.native
/**
  * @constructor Creates an instance of MemoryCache
  */
class MemoryCache () extends TokenCache {
  
  /**
    * @private
    * @property {Array<TokenResponse>} _entries An array of entries in the TokenCache.
    */
  var _entries: js.Array[TokenResponse] = js.native
}
