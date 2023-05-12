package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFiles extends StObject {
  
  /**
    * The location of the first file in Amazon S3.
    */
  var source1: S3Uri
  
  /**
    * The location of the second file in Amazon S3.
    */
  var source2: js.UndefOr[S3Uri] = js.undefined
}
object SourceFiles {
  
  inline def apply(source1: S3Uri): SourceFiles = {
    val __obj = js.Dynamic.literal(source1 = source1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceFiles] (val x: Self) extends AnyVal {
    
    inline def setSource1(value: S3Uri): Self = StObject.set(x, "source1", value.asInstanceOf[js.Any])
    
    inline def setSource2(value: S3Uri): Self = StObject.set(x, "source2", value.asInstanceOf[js.Any])
    
    inline def setSource2Undefined: Self = StObject.set(x, "source2", js.undefined)
  }
}
