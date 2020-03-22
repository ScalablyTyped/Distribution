package typings.async.mod

import typings.async.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "reflectAll")
@js.native
object reflectAll extends js.Object {
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ AnonError[E, T], Unit], 
      Unit
    ]
  ] = js.native
}

