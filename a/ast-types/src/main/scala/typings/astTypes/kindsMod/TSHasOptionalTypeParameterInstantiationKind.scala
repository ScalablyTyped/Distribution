package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
  - typings.astTypes.namedTypesMod.namedTypes.TSImportType
*/
trait TSHasOptionalTypeParameterInstantiationKind extends StObject
object TSHasOptionalTypeParameterInstantiationKind {
  
  @scala.inline
  def TSExpressionWithTypeArguments(expression: IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  }
  
  @scala.inline
  def TSImportType(argument: StringLiteralKind): typings.astTypes.namedTypesMod.namedTypes.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSImportType]
  }
  
  @scala.inline
  def TSTypeReference(typeName: IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  }
}
