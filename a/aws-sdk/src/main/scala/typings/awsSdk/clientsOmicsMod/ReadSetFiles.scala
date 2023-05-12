package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetFiles extends StObject {
  
  /**
    * The files' index.
    */
  var index: js.UndefOr[FileInformation] = js.undefined
  
  /**
    * The location of the first file in Amazon S3.
    */
  var source1: js.UndefOr[FileInformation] = js.undefined
  
  /**
    * The location of the second file in Amazon S3.
    */
  var source2: js.UndefOr[FileInformation] = js.undefined
}
object ReadSetFiles {
  
  inline def apply(): ReadSetFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSetFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetFiles] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: FileInformation): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSource1(value: FileInformation): Self = StObject.set(x, "source1", value.asInstanceOf[js.Any])
    
    inline def setSource1Undefined: Self = StObject.set(x, "source1", js.undefined)
    
    inline def setSource2(value: FileInformation): Self = StObject.set(x, "source2", value.asInstanceOf[js.Any])
    
    inline def setSource2Undefined: Self = StObject.set(x, "source2", js.undefined)
  }
}
