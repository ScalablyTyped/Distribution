package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SetObjectTaggingOperation extends StObject {
  
  /**
    * 
    */
  var TagSet: js.UndefOr[S3TagSet] = js.undefined
}
object S3SetObjectTaggingOperation {
  
  inline def apply(): S3SetObjectTaggingOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectTaggingOperation]
  }
  
  extension [Self <: S3SetObjectTaggingOperation](x: Self) {
    
    inline def setTagSet(value: S3TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    inline def setTagSetUndefined: Self = StObject.set(x, "TagSet", js.undefined)
    
    inline def setTagSetVarargs(value: S3Tag*): Self = StObject.set(x, "TagSet", js.Array(value*))
  }
}
