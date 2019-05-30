package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A node definition in the view.
  *
  * Note: We use one type for all nodes so that loops that loop over all nodes
  * of a ViewDefinition stay monomorphic!
  */
trait NodeDef extends js.Object {
  var bindingFlags: ɵBindingFlags
  var bindingIndex: scala.Double
  var bindings: js.Array[BindingDef]
  var checkIndex: scala.Double
  /** number of transitive children */
  var childCount: scala.Double
  /** aggregated NodeFlags for all transitive children (does not include self) **/
  var childFlags: ɵNodeFlags
  /**
    * Binary or of all query ids that are matched by one of the children.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var childMatchedQueries: scala.Double
  /** aggregated NodeFlags for all direct children (does not include self) **/
  var directChildFlags: ɵNodeFlags
  var element: ElementDef | scala.Null
  var flags: ɵNodeFlags
  /**
    * ids and value types of all queries that are matched by this node.
    */
  var matchedQueries: org.scalablytyped.runtime.NumberDictionary[ɵQueryValueType]
  /** Binary or of all matched query ids of this node. */
  var matchedQueryIds: scala.Double
  var ngContent: NgContentDef | scala.Null
  /** this is checked against NgContentDef.index to find matched nodes */
  var ngContentIndex: scala.Double | scala.Null
  var nodeIndex: scala.Double
  var outputIndex: scala.Double
  var outputs: js.Array[OutputDef]
  var parent: NodeDef | scala.Null
  var provider: ProviderDef | scala.Null
  var query: QueryDef | scala.Null
  /**
    * references that the user placed on the element
    */
  var references: org.scalablytyped.runtime.StringDictionary[ɵQueryValueType]
  var renderParent: NodeDef | scala.Null
  var text: TextDef | scala.Null
}

object NodeDef {
  @scala.inline
  def apply(
    bindingFlags: ɵBindingFlags,
    bindingIndex: scala.Double,
    bindings: js.Array[BindingDef],
    checkIndex: scala.Double,
    childCount: scala.Double,
    childFlags: ɵNodeFlags,
    childMatchedQueries: scala.Double,
    directChildFlags: ɵNodeFlags,
    flags: ɵNodeFlags,
    matchedQueries: org.scalablytyped.runtime.NumberDictionary[ɵQueryValueType],
    matchedQueryIds: scala.Double,
    nodeIndex: scala.Double,
    outputIndex: scala.Double,
    outputs: js.Array[OutputDef],
    references: org.scalablytyped.runtime.StringDictionary[ɵQueryValueType],
    element: ElementDef = null,
    ngContent: NgContentDef = null,
    ngContentIndex: scala.Int | scala.Double = null,
    parent: NodeDef = null,
    provider: ProviderDef = null,
    query: QueryDef = null,
    renderParent: NodeDef = null,
    text: TextDef = null
  ): NodeDef = {
    val __obj = js.Dynamic.literal(bindingFlags = bindingFlags, bindingIndex = bindingIndex, bindings = bindings, checkIndex = checkIndex, childCount = childCount, childFlags = childFlags, childMatchedQueries = childMatchedQueries, directChildFlags = directChildFlags, flags = flags, matchedQueries = matchedQueries, matchedQueryIds = matchedQueryIds, nodeIndex = nodeIndex, outputIndex = outputIndex, outputs = outputs, references = references)
    if (element != null) __obj.updateDynamic("element")(element)
    if (ngContent != null) __obj.updateDynamic("ngContent")(ngContent)
    if (ngContentIndex != null) __obj.updateDynamic("ngContentIndex")(ngContentIndex.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (query != null) __obj.updateDynamic("query")(query)
    if (renderParent != null) __obj.updateDynamic("renderParent")(renderParent)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[NodeDef]
  }
}

