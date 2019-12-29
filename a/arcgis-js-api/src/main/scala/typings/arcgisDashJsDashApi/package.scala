package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arcgisDashJsDashApi {
  import typings.std.Record

  type HashMap[T] = Record[String, T]
  type IPromise[T] = js.Promise[T]
}
