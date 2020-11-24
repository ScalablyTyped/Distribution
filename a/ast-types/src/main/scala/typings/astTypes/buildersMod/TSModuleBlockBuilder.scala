package typings.astTypes.buildersMod

import typings.astTypes.anon.BodyCommentsLoc
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSModuleBlockBuilder extends js.Object {
  
  def apply(body: js.Array[StatementKind]): TSModuleBlock = js.native
  
  def from(params: BodyCommentsLoc): TSModuleBlock = js.native
}
