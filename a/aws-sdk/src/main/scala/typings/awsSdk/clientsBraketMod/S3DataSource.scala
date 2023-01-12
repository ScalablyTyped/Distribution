package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataSource extends StObject {
  
  /**
    * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest that locates the S3 data source.
    */
  var s3Uri: S3Path
}
object S3DataSource {
  
  inline def apply(s3Uri: S3Path): S3DataSource = {
    val __obj = js.Dynamic.literal(s3Uri = s3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DataSource] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: S3Path): Self = StObject.set(x, "s3Uri", value.asInstanceOf[js.Any])
  }
}
