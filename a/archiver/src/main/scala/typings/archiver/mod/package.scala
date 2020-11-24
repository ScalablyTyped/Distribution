package typings.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArchiverOptions = typings.archiver.mod.CoreOptions with typings.archiver.mod.TransformOptions with typings.archiver.mod.ZipOptions with typings.archiver.mod.TarOptions
  
  // tslint:disable-next-line:ban-types support for ConstructorFn function and classes
  type ConstructorFn[T] = js.Function | (org.scalablytyped.runtime.Instantiable1[/* params (repeated) */ js.Any, T])
  
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[
    /* entry */ typings.archiver.mod.EntryData, 
    typings.archiver.archiverBooleans.`false` | typings.archiver.mod.EntryData
  ]
  
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.archiver.archiverStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type TarEntryData = typings.archiver.mod.EntryData
}
