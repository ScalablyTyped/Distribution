package typings.anybar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anybar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Control the [AnyBar app](https://github.com/tonsky/AnyBar).
  @param status - [Name](https://github.com/tonsky/AnyBar#usage) of the color dot you want AnyBar.app to display.
  @returns Returns a promise, but AnyBar.app doesn't send back a reply, so really the only point of waiting for the promise to resolve is in case of an obscure DNS error.
  @example
  ```
  import anybar = require('anybar');
  anybar('purple');
  // The Anybar.app menubar icon turned purple
  ```
  */
  def apply(status: AnybarStatus): js.Promise[Unit] = js.native
  def apply(status: AnybarStatus, options: Options): js.Promise[Unit] = js.native
}

