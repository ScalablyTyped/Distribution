package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisposeKey extends js.Object {
  /**
    * Function that is called when a value is deleted
    */
  var dispose: js.UndefOr[
    js.Function2[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Cache size, unlimited by default
    */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
}

