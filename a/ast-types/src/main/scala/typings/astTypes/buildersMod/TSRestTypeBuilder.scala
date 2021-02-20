package typings.astTypes.buildersMod

import typings.astTypes.anon.TypeAnnotationTSTypeKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSRestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSRestTypeBuilder extends StObject {
  
  def apply(typeAnnotation: TSTypeKind): TSRestType = js.native
  
  def from(params: TypeAnnotationTSTypeKind): TSRestType = js.native
}
