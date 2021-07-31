package typings.astTypes.buildersMod

import typings.astTypes.anon.CheckType
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSConditionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSConditionalTypeBuilder extends StObject {
  
  def apply(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType = js.native
  
  def from(params: CheckType): TSConditionalType = js.native
}
