package typings.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArchiverOptions = typings.archiver.mod.CoreOptions with typings.archiver.mod.TransformOptions with typings.archiver.mod.ZipOptions with typings.archiver.mod.TarOptions
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[
    /* entry */ typings.archiver.mod.EntryData, 
    typings.archiver.archiverBooleans.`false` | typings.archiver.mod.EntryData
  ]
}
