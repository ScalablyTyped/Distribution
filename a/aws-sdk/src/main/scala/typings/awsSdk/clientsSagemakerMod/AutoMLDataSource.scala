package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLDataSource extends StObject {
  
  /**
    * The Amazon S3 location of the input data.
    */
  var S3DataSource: AutoMLS3DataSource
}
object AutoMLDataSource {
  
  inline def apply(S3DataSource: AutoMLS3DataSource): AutoMLDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLDataSource]
  }
  
  extension [Self <: AutoMLDataSource](x: Self) {
    
    inline def setS3DataSource(value: AutoMLS3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
  }
}
