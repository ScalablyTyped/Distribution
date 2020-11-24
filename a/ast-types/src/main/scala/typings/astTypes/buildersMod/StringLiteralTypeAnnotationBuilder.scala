package typings.astTypes.buildersMod

import typings.astTypes.anon.RawValue
import typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteralTypeAnnotationBuilder extends js.Object {
  
  def apply(value: String, raw: String): StringLiteralTypeAnnotation = js.native
  
  def from(params: RawValue): StringLiteralTypeAnnotation = js.native
}
