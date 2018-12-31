package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an asynchronous queue, each pop is a promise
  * that is resolved with an existing element or an element that will be pushed in the future
  */
@JSGlobal("adone.collection.AsyncQueue")
@js.native
class AsyncQueue[T] ()
  extends Queue[T, js.Promise[T]]

