package typings.angularCompiler.apiMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3QueryMetadata extends js.Object {
  /**
    * Whether to include only direct children or all descendants.
    */
  var descendants: Boolean = js.native
  /**
    * Whether to read only the first matching result, or an array of results.
    */
  var first: Boolean = js.native
  /**
    * Either an expression representing a type for the query predicate, or a set of string selectors.
    */
  var predicate: Expression | js.Array[String] = js.native
  /**
    * Name of the property on the class to update with query results.
    */
  var propertyName: String = js.native
  /**
    * An expression representing a type to read from each matched node, or null if the default value
    * for a given node is to be returned.
    */
  var read: Expression | Null = js.native
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
  var static: Boolean = js.native
}

object R3QueryMetadata {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: Expression | js.Array[String],
    propertyName: String,
    static: Boolean
  ): R3QueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3QueryMetadata]
  }
  @scala.inline
  implicit class R3QueryMetadataOps[Self <: R3QueryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescendants(value: Boolean): Self = this.set("descendants", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicateVarargs(value: String*): Self = this.set("predicate", js.Array(value :_*))
    @scala.inline
    def setPredicate(value: Expression | js.Array[String]): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Expression): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadNull: Self = this.set("read", null)
  }
  
}

