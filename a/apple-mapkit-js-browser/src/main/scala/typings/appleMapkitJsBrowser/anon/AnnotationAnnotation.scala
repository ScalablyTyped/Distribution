package typings.appleMapkitJsBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationAnnotation extends js.Object {
  
  var annotation: typings.appleMapkitJsBrowser.mapkit.Annotation = js.native
}
object AnnotationAnnotation {
  
  @scala.inline
  def apply(annotation: typings.appleMapkitJsBrowser.mapkit.Annotation): AnnotationAnnotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationAnnotation]
  }
  
  @scala.inline
  implicit class AnnotationAnnotationOps[Self <: AnnotationAnnotation] (val x: Self) extends AnyVal {
    
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
    def setAnnotation(value: typings.appleMapkitJsBrowser.mapkit.Annotation): Self = this.set("annotation", value.asInstanceOf[js.Any])
  }
}
