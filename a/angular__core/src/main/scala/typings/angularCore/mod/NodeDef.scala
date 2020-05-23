package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
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
  var bindingIndex: Double
  var bindings: js.Array[BindingDef]
  var checkIndex: Double
  /** number of transitive children */
  var childCount: Double
  /** aggregated NodeFlags for all transitive children (does not include self) **/
  var childFlags: ɵNodeFlags
  /**
    * Binary or of all query ids that are matched by one of the children.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var childMatchedQueries: Double
  /** aggregated NodeFlags for all direct children (does not include self) **/
  var directChildFlags: ɵNodeFlags
  var element: ElementDef | Null
  var flags: ɵNodeFlags
  /**
    * ids and value types of all queries that are matched by this node.
    */
  var matchedQueries: NumberDictionary[ɵQueryValueType]
  /** Binary or of all matched query ids of this node. */
  var matchedQueryIds: Double
  var ngContent: NgContentDef | Null
  /** this is checked against NgContentDef.index to find matched nodes */
  var ngContentIndex: Double | Null
  var nodeIndex: Double
  var outputIndex: Double
  var outputs: js.Array[OutputDef]
  var parent: NodeDef | Null
  var provider: ProviderDef | Null
  var query: QueryDef | Null
  /**
    * references that the user placed on the element
    */
  var references: StringDictionary[ɵQueryValueType]
  var renderParent: NodeDef | Null
  var text: TextDef | Null
}

object NodeDef {
  @scala.inline
  def apply(
    bindingFlags: ɵBindingFlags,
    bindingIndex: Double,
    bindings: js.Array[BindingDef],
    checkIndex: Double,
    childCount: Double,
    childFlags: ɵNodeFlags,
    childMatchedQueries: Double,
    directChildFlags: ɵNodeFlags,
    flags: ɵNodeFlags,
    matchedQueries: NumberDictionary[ɵQueryValueType],
    matchedQueryIds: Double,
    nodeIndex: Double,
    outputIndex: Double,
    outputs: js.Array[OutputDef],
    references: StringDictionary[ɵQueryValueType],
    element: ElementDef = null,
    ngContent: NgContentDef = null,
    ngContentIndex: Double = null.asInstanceOf[Double],
    parent: NodeDef = null,
    provider: ProviderDef = null,
    query: QueryDef = null,
    renderParent: NodeDef = null,
    text: TextDef = null
  ): NodeDef = {
    val __obj = js.Dynamic.literal(bindingFlags = bindingFlags.asInstanceOf[js.Any], bindingIndex = bindingIndex.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], checkIndex = checkIndex.asInstanceOf[js.Any], childCount = childCount.asInstanceOf[js.Any], childFlags = childFlags.asInstanceOf[js.Any], childMatchedQueries = childMatchedQueries.asInstanceOf[js.Any], directChildFlags = directChildFlags.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], matchedQueries = matchedQueries.asInstanceOf[js.Any], matchedQueryIds = matchedQueryIds.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any], outputIndex = outputIndex.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], ngContent = ngContent.asInstanceOf[js.Any], ngContentIndex = ngContentIndex.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], renderParent = renderParent.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef]
  }
}

