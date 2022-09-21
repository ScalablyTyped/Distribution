package typings.angularDevkitSchematics.mod

import typings.angularDevkitCore.mod.virtualFs.SyncDelegateHost
import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitSchematics.treeInterfaceMod.DirEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "HostDirEntry")
@js.native
open class HostDirEntry protected ()
  extends typings.angularDevkitSchematics.hostTreeMod.HostDirEntry {
  def this(
    parent: Null,
    path: Path_,
    _host: SyncDelegateHost[js.Object],
    _tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree
  ) = this()
  def this(
    parent: DirEntry,
    path: Path_,
    _host: SyncDelegateHost[js.Object],
    _tree: typings.angularDevkitSchematics.treeInterfaceMod.Tree
  ) = this()
}
