package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSource extends StObject {
  
  /**
    *  The source S3 bucket. 
    */
  var S3: S3ImportSource
}
object ImportSource {
  
  inline def apply(S3: S3ImportSource): ImportSource = {
    val __obj = js.Dynamic.literal(S3 = S3.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportSource] (val x: Self) extends AnyVal {
    
    inline def setS3(value: S3ImportSource): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
  }
}
