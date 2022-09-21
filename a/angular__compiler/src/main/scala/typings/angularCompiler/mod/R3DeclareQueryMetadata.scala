package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareQueryMetadata extends StObject {
  
  /**
    * Whether to include only direct children or all descendants. Defaults to false.
    */
  var descendants: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True to only fire changes if there are underlying changes to the query.
    */
  var emitDistinctChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to read only the first matching result, or an array of results. Defaults to false.
    */
  var first: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Either an expression representing a type (possibly wrapped in a `forwardRef()`) or
    * `InjectionToken` for the query predicate, or a set of string selectors.
    */
  var predicate: Expression | js.Array[String]
  
  /**
    * Name of the property on the class to update with query results.
    */
  var propertyName: String
  
  /**
    * An expression representing a type to read from each matched node, or null if the default value
    * for a given node is to be returned.
    */
  var read: js.UndefOr[Expression] = js.undefined
  
  /**
    * Whether or not this query should collect only static results. Defaults to false.
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
  var static: js.UndefOr[Boolean] = js.undefined
}
object R3DeclareQueryMetadata {
  
  inline def apply(predicate: Expression | js.Array[String], propertyName: String): R3DeclareQueryMetadata = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareQueryMetadata]
  }
  
  extension [Self <: R3DeclareQueryMetadata](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    inline def setEmitDistinctChangesOnly(value: Boolean): Self = StObject.set(x, "emitDistinctChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setEmitDistinctChangesOnlyUndefined: Self = StObject.set(x, "emitDistinctChangesOnly", js.undefined)
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setPredicate(value: Expression | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value*))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Expression): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
