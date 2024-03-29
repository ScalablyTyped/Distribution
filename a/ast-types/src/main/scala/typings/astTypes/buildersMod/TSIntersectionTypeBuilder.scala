package typings.astTypes.buildersMod

import typings.astTypes.anon.LocTypes
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIntersectionTypeBuilder extends StObject {
  
  def apply(types: js.Array[TSTypeKind]): TSIntersectionType = js.native
  
  def from(params: LocTypes): TSIntersectionType = js.native
}
