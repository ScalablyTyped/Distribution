package typings
package adoneLib.adoneNs.fastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type CoreStreamSource = adoneLib.adoneNs.streamNs.coreNs.INs.Source[js.Any, File]
  type DirectoryFile = File
  type MapSource = Mapping | js.Array[Mapping]
  type SymbolicFile = File
  type WatchMapOptions = MapOptions with WatcherConstructorOptions
  type WatcherConstructorOptions = adoneLib.adoneNs.fsNs.INs.WatcherNs.ConstructorOptions
}
