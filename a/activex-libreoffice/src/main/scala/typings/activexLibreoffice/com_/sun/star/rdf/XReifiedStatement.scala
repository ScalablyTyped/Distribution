package typings.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a reified RDF statement.
  * @see XRepository
  * @since OOo 3.0
  */
trait XReifiedStatement
  extends StObject
     with XNode {
  
  var Statement: typings.activexLibreoffice.com_.sun.star.rdf.Statement
}
object XReifiedStatement {
  
  inline def apply(Statement: Statement, StringValue: String): XReifiedStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XReifiedStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XReifiedStatement] (val x: Self) extends AnyVal {
    
    inline def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}
