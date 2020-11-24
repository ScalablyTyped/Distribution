package typings.atomically.anon

import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallPathOptions extends js.Object {
  
  def apply(path: PathLike): Stats = js.native
  def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
  def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
}
