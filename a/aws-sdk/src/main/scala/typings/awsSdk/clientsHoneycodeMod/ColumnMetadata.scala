package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMetadata extends StObject {
  
  /**
    * The format of the column.
    */
  var format: Format
  
  /**
    * The name of the column.
    */
  var name: Name
}
object ColumnMetadata {
  
  inline def apply(format: Format, name: Name): ColumnMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
