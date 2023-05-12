package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTileOutput extends StObject {
  
  /**
    * The output binary file.
    */
  var BinaryFile: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.BinaryFile] = js.undefined
}
object GetTileOutput {
  
  inline def apply(): GetTileOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTileOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTileOutput] (val x: Self) extends AnyVal {
    
    inline def setBinaryFile(value: BinaryFile): Self = StObject.set(x, "BinaryFile", value.asInstanceOf[js.Any])
    
    inline def setBinaryFileUndefined: Self = StObject.set(x, "BinaryFile", js.undefined)
  }
}
