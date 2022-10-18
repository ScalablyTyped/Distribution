package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3 extends StObject {
  
  var Bucket: js.UndefOr[string] = js.undefined
  
  var Enabled: boolean
  
  var Prefix: js.UndefOr[string] = js.undefined
}
object S3 {
  
  inline def apply(Enabled: boolean): S3 = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3]
  }
  
  extension [Self <: S3](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: string): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
