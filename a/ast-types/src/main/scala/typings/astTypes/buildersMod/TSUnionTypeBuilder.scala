package typings.astTypes.buildersMod

import typings.astTypes.anon.LocTypes
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSUnionTypeBuilder extends js.Object {
  
  def apply(types: js.Array[TSTypeKind]): TSUnionType = js.native
  
  def from(params: LocTypes): TSUnionType = js.native
}
