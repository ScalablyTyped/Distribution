package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends js.Object {
  var annotation: typings.angularCompiler.coreMod.Directive = js.native
  var metadata: CompileDirectiveMetadata = js.native
}

object Annotation {
  @scala.inline
  def apply(annotation: typings.angularCompiler.coreMod.Directive, metadata: CompileDirectiveMetadata): Annotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotation(value: typings.angularCompiler.coreMod.Directive): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: CompileDirectiveMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

