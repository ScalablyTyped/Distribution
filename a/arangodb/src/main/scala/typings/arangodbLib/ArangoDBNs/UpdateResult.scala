package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateResult[T /* <: js.Object */] extends UpdateMetadata {
  var `new`: js.UndefOr[Document[T]] = js.undefined
  var old: js.UndefOr[Document[T]] = js.undefined
}

