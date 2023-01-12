package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFormat extends StObject {
  
  /**
    * The .csv file format.
    */
  var csv: js.UndefOr[Csv] = js.undefined
}
object FileFormat {
  
  inline def apply(): FileFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileFormat] (val x: Self) extends AnyVal {
    
    inline def setCsv(value: Csv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
