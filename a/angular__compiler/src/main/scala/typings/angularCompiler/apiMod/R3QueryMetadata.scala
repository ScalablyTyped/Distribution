package typings.angularCompiler.apiMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3QueryMetadata extends js.Object {
  /**
    * Whether to include only direct children or all descendants.
    */
  var descendants: Boolean
  /**
    * Whether to read only the first matching result, or an array of results.
    */
  var first: Boolean
  /**
    * Either an expression representing a type for the query predicate, or a set of string selectors.
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
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: Expression | js.Array[String],
    propertyName: String,
    static: Boolean,
    read: Expression = null
  ): R3QueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3QueryMetadata]
  }
}

