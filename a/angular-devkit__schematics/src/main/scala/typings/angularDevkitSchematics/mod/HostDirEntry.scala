package typings.angularDevkitSchematics.mod

import typings.angularDevkitCore.mod.virtualFs.SyncDelegateHost
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcTreeInterfaceMod.DirEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "HostDirEntry")
@js.native
open class HostDirEntry protected ()
  extends typings.angularDevkitSchematics.srcTreeHostTreeMod.HostDirEntry {
  def this(
    parent: Null,
    path: Path_,
    _host: SyncDelegateHost[js.Object],
    _tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ) = this()
  def this(
    parent: DirEntry,
    path: Path_,
    _host: SyncDelegateHost[js.Object],
    _tree: typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
  ) = this()
}
