package typings.astTypes.buildersMod

import typings.astTypes.anon.Properties
import typings.astTypes.kindsMod.ObjectMethodKind
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.PropertyKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.kindsMod.SpreadPropertyKind
import typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectExpressionBuilder extends StObject {
  
  def apply(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  
  def from(params: Properties): ObjectExpression = js.native
}
