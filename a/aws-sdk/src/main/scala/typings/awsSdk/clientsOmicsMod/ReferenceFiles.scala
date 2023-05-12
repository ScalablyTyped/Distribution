package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceFiles extends StObject {
  
  /**
    * The files' index.
    */
  var index: js.UndefOr[FileInformation] = js.undefined
  
  /**
    * The source file's location in Amazon S3.
    */
  var source: js.UndefOr[FileInformation] = js.undefined
}
object ReferenceFiles {
  
  inline def apply(): ReferenceFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceFiles] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: FileInformation): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSource(value: FileInformation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
