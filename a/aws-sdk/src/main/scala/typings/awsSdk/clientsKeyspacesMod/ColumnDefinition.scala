package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDefinition extends StObject {
  
  /**
    * The name of the column.
    */
  var name: GenericString
  
  /**
    * The data type of the column. For a list of available data types, see Data types in the Amazon Keyspaces Developer Guide.
    */
  var `type`: GenericString
}
object ColumnDefinition {
  
  inline def apply(name: GenericString, `type`: GenericString): ColumnDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
  
  extension [Self <: ColumnDefinition](x: Self) {
    
    inline def setName(value: GenericString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: GenericString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
