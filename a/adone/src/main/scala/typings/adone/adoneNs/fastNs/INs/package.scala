package typings.adone.adoneNs.fastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  import typings.adone.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions
  import typings.adone.adoneNs.streamNs.coreNs.INs.Source

  type CoreStreamSource = Source[js.Any, typings.adone.adoneNs.fastNs.INs.File]
  type DirectoryFile = typings.adone.adoneNs.fastNs.INs.File
  type MapSource = Mapping | js.Array[Mapping]
  type SymbolicFile = typings.adone.adoneNs.fastNs.INs.File
  type WatchMapOptions = MapOptions with WatcherConstructorOptions
  type WatcherConstructorOptions = ConstructorOptions
}
