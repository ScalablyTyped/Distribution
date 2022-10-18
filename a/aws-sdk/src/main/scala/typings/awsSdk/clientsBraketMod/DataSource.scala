package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /**
    * Information about the data stored in Amazon S3 used by the Amazon Braket job.
    */
  var s3DataSource: S3DataSource
}
object DataSource {
  
  inline def apply(s3DataSource: S3DataSource): DataSource = {
    val __obj = js.Dynamic.literal(s3DataSource = s3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setS3DataSource(value: S3DataSource): Self = StObject.set(x, "s3DataSource", value.asInstanceOf[js.Any])
  }
}
