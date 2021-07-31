package typings.astTypes.buildersMod

import typings.astTypes.anon.ParamsArray
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeParameterInstantiationBuilder extends StObject {
  
  def apply(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  
  def from(params: ParamsArray): TSTypeParameterInstantiation = js.native
}
