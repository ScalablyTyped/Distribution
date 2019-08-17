package typings.adone.adoneNs.collectionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BufferListNs {
  import typings.adone.adoneNs.collectionNs.BufferList
  import typings.node.Buffer

  type Appendable = Buffer | BufferList | String | Double | (js.Array[Buffer | BufferList | String | Double])
}
