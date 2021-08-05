package typings.activexLibreoffice.com_.sun.star.rdf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a RDF statement, or triple.
  * @see XRepository
  * @since OOo 3.2
  */
trait Statement extends StObject {
  
  var Graph: XURI
  
  var Object: XNode
  
  var Predicate: XURI
  
  var Subject: XResource
}
object Statement {
  
  inline def apply(Graph: XURI, Object: XNode, Predicate: XURI, Subject: XResource): Statement = {
    val __obj = js.Dynamic.literal(Graph = Graph.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  extension [Self <: Statement](x: Self) {
    
    inline def setGraph(value: XURI): Self = StObject.set(x, "Graph", value.asInstanceOf[js.Any])
    
    inline def setObject(value: XNode): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: XURI): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: XResource): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
