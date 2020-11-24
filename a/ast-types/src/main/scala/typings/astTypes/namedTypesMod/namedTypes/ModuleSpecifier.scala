package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleSpecifier extends Node {
  
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  
  var local: js.UndefOr[IdentifierKind | Null] = js.native
  
  var name: js.UndefOr[IdentifierKind | Null] = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.ModuleSpecifier")
@js.native
object ModuleSpecifier extends TopLevel[Type[ModuleSpecifier]]
