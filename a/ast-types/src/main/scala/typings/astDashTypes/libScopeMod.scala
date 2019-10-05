package typings.astDashTypes

import org.scalablytyped.runtime.Instantiable2
import typings.astDashTypes.libScopeMod.Scope
import typings.astDashTypes.libScopeMod.ScopeConstructor
import typings.astDashTypes.typesMod.Fork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/lib/scope", JSImport.Namespace)
@js.native
object libScopeMod extends js.Object {
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
  
  @js.native
  trait ScopeConstructor
    extends Instantiable2[/* path */ js.Any, /* parentScope */ js.Any, Scope] {
    def isEstablishedBy(node: js.Any): js.Any = js.native
  }
  
  def default(fork: Fork): ScopeConstructor = js.native
}

