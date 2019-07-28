package typings.astDashTypes.libScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  var bindings: js.Any = js.native
  var depth: Double = js.native
  var didScan: Boolean = js.native
  var isGlobal: Boolean = js.native
  var node: js.Any = js.native
  var parent: js.Any = js.native
  var path: js.Any = js.native
  var types: js.Any = js.native
  def declareTemporary(): js.Any = js.native
  def declareTemporary(prefix: js.Any): js.Any = js.native
  def declares(name: js.Any): js.Any = js.native
  def declaresType(name: js.Any): js.Any = js.native
  def getBindings(): js.Any = js.native
  def getGlobalScope(): Scope = js.native
  def getTypes(): js.Any = js.native
  def injectTemporary(identifier: js.Any, init: js.Any): js.Any = js.native
  def lookup(name: js.Any): js.Any = js.native
  def lookupType(name: js.Any): js.Any = js.native
  def scan(): js.Any = js.native
  def scan(force: js.Any): js.Any = js.native
}

