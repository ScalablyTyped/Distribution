package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantImportItemSource extends StObject {
  
  /**
    * The source file's location in Amazon S3.
    */
  var source: S3Uri
}
object VariantImportItemSource {
  
  inline def apply(source: S3Uri): VariantImportItemSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantImportItemSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariantImportItemSource] (val x: Self) extends AnyVal {
    
    inline def setSource(value: S3Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
