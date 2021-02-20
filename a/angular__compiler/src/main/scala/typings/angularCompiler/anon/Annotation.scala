package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends StObject {
  
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
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: typings.angularCompiler.coreMod.Directive): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: CompileDirectiveMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
