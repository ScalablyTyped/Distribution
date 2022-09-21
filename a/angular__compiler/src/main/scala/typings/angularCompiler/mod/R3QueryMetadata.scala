package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3QueryMetadata extends StObject {
  
  /**
    * Whether to include only direct children or all descendants.
    */
  var descendants: Boolean
  
  /**
    * If the `QueryList` should fire change event only if actual change to query was computed (vs old
    * behavior where the change was fired whenever the query was recomputed, even if the recomputed
    * query resulted in the same list.)
    */
  var emitDistinctChangesOnly: Boolean
  
  /**
    * Whether to read only the first matching result, or an array of results.
    */
  var first: Boolean
  
  /**
    * Either an expression representing a type or `InjectionToken` for the query
    * predicate, or a set of string selectors.
    */
  var predicate: MaybeForwardRefExpression[Expression] | js.Array[String]
  
  /**
    * Name of the property on the class to update with query results.
    */
  var propertyName: String
  
  /**
    * An expression representing a type to read from each matched node, or null if the default value
    * for a given node is to be returned.
    */
  var read: Expression | Null
  
  /**
    * Whether or not this query should collect only static results.
    *
    * If static is true, the query's results will be set on the component after nodes are created,
    * but before change detection runs. This means that any results that relied upon change detection
    * to run (e.g. results inside *ngIf or *ngFor views) will not be collected. Query results are
    * available in the ngOnInit hook.
    *
    * If static is false, the query's results will be set on the component after change detection
    * runs. This means that the query results can contain nodes inside *ngIf or *ngFor views, but
    * the results will not be available in the ngOnInit hook (only in the ngAfterContentInit for
    * content hooks and ngAfterViewInit for view hooks).
    */
  var static: Boolean
}
object R3QueryMetadata {
  
  inline def apply(
    descendants: Boolean,
    emitDistinctChangesOnly: Boolean,
    first: Boolean,
    predicate: MaybeForwardRefExpression[Expression] | js.Array[String],
    propertyName: String,
    static: Boolean
  ): R3QueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], emitDistinctChangesOnly = emitDistinctChangesOnly.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], read = null)
    __obj.asInstanceOf[R3QueryMetadata]
  }
  
  extension [Self <: R3QueryMetadata](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setEmitDistinctChangesOnly(value: Boolean): Self = StObject.set(x, "emitDistinctChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: MaybeForwardRefExpression[Expression] | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value*))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Expression): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadNull: Self = StObject.set(x, "read", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
