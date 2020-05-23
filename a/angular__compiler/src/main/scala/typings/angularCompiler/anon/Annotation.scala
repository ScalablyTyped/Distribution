package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var annotation: typings.angularCompiler.coreMod.Directive
  var metadata: CompileDirectiveMetadata
}

object Annotation {
  @scala.inline
  def apply(annotation: typings.angularCompiler.coreMod.Directive, metadata: CompileDirectiveMetadata): Annotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

