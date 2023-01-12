package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatementOutputData extends StObject {
  
  /**
    * The code execution output in text format.
    */
  var TextPlain: js.UndefOr[GenericString] = js.undefined
}
object StatementOutputData {
  
  inline def apply(): StatementOutputData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatementOutputData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatementOutputData] (val x: Self) extends AnyVal {
    
    inline def setTextPlain(value: GenericString): Self = StObject.set(x, "TextPlain", value.asInstanceOf[js.Any])
    
    inline def setTextPlainUndefined: Self = StObject.set(x, "TextPlain", js.undefined)
  }
}
