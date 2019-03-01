package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object archiverNs {
  type ArchiverOptions = CoreOptions with TransformOptions with ZipOptions with TarOptions
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[/* entry */ EntryData, archiverLib.archiverLibNumbers.`false` | EntryData]
}
