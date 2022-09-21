package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TQuery objects represent all the query-related data that remain the same from one view instance
  * to another and can be determined on the very first template pass. Most notably TQuery holds all
  * the matches for a given view.
  */
trait TQuery extends StObject {
  
  /**
    * A flag indicating if a given query crosses an <ng-template> element. This flag exists for
    * performance reasons: we can notice that queries not crossing any <ng-template> elements will
    * have matches from a given view only (and adapt processing accordingly).
    */
  var crossesNgTemplate: Boolean
  
  /**
    * A method called when processing the elementEnd instruction - this is mostly useful to determine
    * if a given content query should match any nodes past this point.
    * @param tNode
    */
  def elementEnd(tNode: TNode): Unit
  
  /**
    * A method call when a given query is crossing an element (or element container). This is where a
    * given TNode is matched against a query predicate.
    * @param tView
    * @param tNode
    */
  def elementStart(tView: TView, tNode: TNode): Unit
  
  /**
    * A query-related method called when an embedded TView is created based on the content of a
    * <ng-template> element. We call this method to determine if a given query should be propagated
    * to the embedded view and if so - return a cloned TQuery for this embedded view.
    * @param tNode
    * @param childQueryIndex
    */
  def embeddedTView(tNode: TNode, childQueryIndex: Double): TQuery | Null
  
  /**
    * Index of a query in a declaration view in case of queries propagated to en embedded view, -1
    * for queries declared in a given view. We are storing this index so we can find a parent query
    * to clone for an embedded view (when an embedded view is created).
    */
  var indexInDeclarationView: Double
  
  /**
    * Matches collected on the first template pass. Each match is a pair of:
    * - TNode index;
    * - match index;
    *
    * A TNode index can be either:
    * - a positive number (the most common case) to indicate a matching TNode;
    * - a negative number to indicate that a given query is crossing a <ng-template> element and
    * results from views created based on TemplateRef should be inserted at this place.
    *
    * A match index is a number used to find an actual value (for a given node) when query results
    * are materialized. This index can have one of the following values:
    * - -2 - indicates that we need to read a special token (TemplateRef, ViewContainerRef etc.);
    * - -1 - indicates that we need to read a default value based on the node type (TemplateRef for
    * ng-template and ElementRef for other elements);
    * - a positive number - index of an injectable to be read from the element injector.
    */
  var matches: js.Array[Double] | Null
  
  /**
    * Query metadata extracted from query annotations.
    */
  var metadata: TQueryMetadata
  
  /**
    * A method called when processing the template instruction. This is where a
    * given TContainerNode is matched against a query predicate.
    * @param tView
    * @param tNode
    */
  def template(tView: TView, tNode: TNode): Unit
}
object TQuery {
  
  inline def apply(
    crossesNgTemplate: Boolean,
    elementEnd: TNode => Unit,
    elementStart: (TView, TNode) => Unit,
    embeddedTView: (TNode, Double) => TQuery | Null,
    indexInDeclarationView: Double,
    metadata: TQueryMetadata,
    template: (TView, TNode) => Unit
  ): TQuery = {
    val __obj = js.Dynamic.literal(crossesNgTemplate = crossesNgTemplate.asInstanceOf[js.Any], elementEnd = js.Any.fromFunction1(elementEnd), elementStart = js.Any.fromFunction2(elementStart), embeddedTView = js.Any.fromFunction2(embeddedTView), indexInDeclarationView = indexInDeclarationView.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), matches = null)
    __obj.asInstanceOf[TQuery]
  }
  
  extension [Self <: TQuery](x: Self) {
    
    inline def setCrossesNgTemplate(value: Boolean): Self = StObject.set(x, "crossesNgTemplate", value.asInstanceOf[js.Any])
    
    inline def setElementEnd(value: TNode => Unit): Self = StObject.set(x, "elementEnd", js.Any.fromFunction1(value))
    
    inline def setElementStart(value: (TView, TNode) => Unit): Self = StObject.set(x, "elementStart", js.Any.fromFunction2(value))
    
    inline def setEmbeddedTView(value: (TNode, Double) => TQuery | Null): Self = StObject.set(x, "embeddedTView", js.Any.fromFunction2(value))
    
    inline def setIndexInDeclarationView(value: Double): Self = StObject.set(x, "indexInDeclarationView", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[Double]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesNull: Self = StObject.set(x, "matches", null)
    
    inline def setMatchesVarargs(value: Double*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setMetadata(value: TQueryMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: (TView, TNode) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
  }
}
