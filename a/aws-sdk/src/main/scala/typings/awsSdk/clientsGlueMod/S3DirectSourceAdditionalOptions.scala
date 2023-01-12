package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DirectSourceAdditionalOptions extends StObject {
  
  /**
    * Sets the upper limit for the target number of files that will be processed.
    */
  var BoundedFiles: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * Sets the upper limit for the target size of the dataset in bytes that will be processed.
    */
  var BoundedSize: js.UndefOr[BoxedLong] = js.undefined
  
  /**
    * Sets option to enable a sample path.
    */
  var EnableSamplePath: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If enabled, specifies the sample path.
    */
  var SamplePath: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object S3DirectSourceAdditionalOptions {
  
  inline def apply(): S3DirectSourceAdditionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DirectSourceAdditionalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DirectSourceAdditionalOptions] (val x: Self) extends AnyVal {
    
    inline def setBoundedFiles(value: BoxedLong): Self = StObject.set(x, "BoundedFiles", value.asInstanceOf[js.Any])
    
    inline def setBoundedFilesUndefined: Self = StObject.set(x, "BoundedFiles", js.undefined)
    
    inline def setBoundedSize(value: BoxedLong): Self = StObject.set(x, "BoundedSize", value.asInstanceOf[js.Any])
    
    inline def setBoundedSizeUndefined: Self = StObject.set(x, "BoundedSize", js.undefined)
    
    inline def setEnableSamplePath(value: BoxedBoolean): Self = StObject.set(x, "EnableSamplePath", value.asInstanceOf[js.Any])
    
    inline def setEnableSamplePathUndefined: Self = StObject.set(x, "EnableSamplePath", js.undefined)
    
    inline def setSamplePath(value: EnclosedInStringProperty): Self = StObject.set(x, "SamplePath", value.asInstanceOf[js.Any])
    
    inline def setSamplePathUndefined: Self = StObject.set(x, "SamplePath", js.undefined)
  }
}
