package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * The number of lines from the beginning of the file to the end of the sensitive data. 
    */
  var end: js.UndefOr[long] = js.undefined
  
  /**
    * The number of lines from the beginning of the file to the beginning of the sensitive data. 
    */
  var start: js.UndefOr[long] = js.undefined
  
  /**
    * The number of characters, with spaces and starting from 1, from the beginning of the first line that contains the sensitive data (start) to the beginning of the sensitive data.
    */
  var startColumn: js.UndefOr[long] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setEnd(value: long): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: long): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: long): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
