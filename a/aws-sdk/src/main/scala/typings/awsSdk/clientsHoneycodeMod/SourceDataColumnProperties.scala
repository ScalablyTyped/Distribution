package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDataColumnProperties extends StObject {
  
  /**
    * The index of the column in the input file.
    */
  var columnIndex: js.UndefOr[SourceDataColumnIndex] = js.undefined
}
object SourceDataColumnProperties {
  
  inline def apply(): SourceDataColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDataColumnProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceDataColumnProperties] (val x: Self) extends AnyVal {
    
    inline def setColumnIndex(value: SourceDataColumnIndex): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
  }
}
