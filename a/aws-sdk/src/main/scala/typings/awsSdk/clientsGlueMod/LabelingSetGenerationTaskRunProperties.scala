package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingSetGenerationTaskRunProperties extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
    */
  var OutputS3Path: js.UndefOr[UriString] = js.undefined
}
object LabelingSetGenerationTaskRunProperties {
  
  inline def apply(): LabelingSetGenerationTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingSetGenerationTaskRunProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelingSetGenerationTaskRunProperties] (val x: Self) extends AnyVal {
    
    inline def setOutputS3Path(value: UriString): Self = StObject.set(x, "OutputS3Path", value.asInstanceOf[js.Any])
    
    inline def setOutputS3PathUndefined: Self = StObject.set(x, "OutputS3Path", js.undefined)
  }
}
