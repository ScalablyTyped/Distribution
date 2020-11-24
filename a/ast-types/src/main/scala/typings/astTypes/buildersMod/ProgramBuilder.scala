package typings.astTypes.buildersMod

import typings.astTypes.anon.Body
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgramBuilder extends js.Object {
  
  def apply(body: js.Array[StatementKind]): Program = js.native
  
  def from(params: Body): Program = js.native
}
