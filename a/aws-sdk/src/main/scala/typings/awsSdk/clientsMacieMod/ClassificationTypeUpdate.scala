package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationTypeUpdate extends StObject {
  
  /**
    * (Discontinued) A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie Classic begins performing continuous classification after a bucket is successfully associated with Macie Classic. 
    */
  var continuous: js.UndefOr[S3ContinuousClassificationType] = js.undefined
  
  /**
    * (Discontinued) A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: js.UndefOr[S3OneTimeClassificationType] = js.undefined
}
object ClassificationTypeUpdate {
  
  inline def apply(): ClassificationTypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationTypeUpdate]
  }
  
  extension [Self <: ClassificationTypeUpdate](x: Self) {
    
    inline def setContinuous(value: S3ContinuousClassificationType): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setOneTime(value: S3OneTimeClassificationType): Self = StObject.set(x, "oneTime", value.asInstanceOf[js.Any])
    
    inline def setOneTimeUndefined: Self = StObject.set(x, "oneTime", js.undefined)
  }
}
