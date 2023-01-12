package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlAlias extends StObject {
  
  /**
    * A temporary name given to a table, or a column in a table.
    */
  var Alias: EnclosedInStringPropertyWithQuote
  
  /**
    * A table, or a column in a table.
    */
  var From: NodeId
}
object SqlAlias {
  
  inline def apply(Alias: EnclosedInStringPropertyWithQuote, From: NodeId): SqlAlias = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlAlias] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: EnclosedInStringPropertyWithQuote): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: NodeId): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
  }
}
