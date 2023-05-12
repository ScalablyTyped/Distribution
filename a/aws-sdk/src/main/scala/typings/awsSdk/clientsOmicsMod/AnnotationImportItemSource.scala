package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationImportItemSource extends StObject {
  
  /**
    * The source file's location in Amazon S3.
    */
  var source: S3Uri
}
object AnnotationImportItemSource {
  
  inline def apply(source: S3Uri): AnnotationImportItemSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationImportItemSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationImportItemSource] (val x: Self) extends AnyVal {
    
    inline def setSource(value: S3Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
