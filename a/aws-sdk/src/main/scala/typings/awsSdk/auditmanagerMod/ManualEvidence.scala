package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualEvidence extends StObject {
  
  /**
    *  The Amazon S3 URL that points to a manual evidence object. 
    */
  var s3ResourcePath: js.UndefOr[S3Url] = js.undefined
}
object ManualEvidence {
  
  inline def apply(): ManualEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualEvidence]
  }
  
  extension [Self <: ManualEvidence](x: Self) {
    
    inline def setS3ResourcePath(value: S3Url): Self = StObject.set(x, "s3ResourcePath", value.asInstanceOf[js.Any])
    
    inline def setS3ResourcePathUndefined: Self = StObject.set(x, "s3ResourcePath", js.undefined)
  }
}
