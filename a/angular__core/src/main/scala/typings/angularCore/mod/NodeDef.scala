package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node definition in the view.
  *
  * Note: We use one type for all nodes so that loops that loop over all nodes
  * of a ViewDefinition stay monomorphic!
  */
@js.native
trait NodeDef extends js.Object {
  var bindingFlags: ɵBindingFlags = js.native
  var bindingIndex: Double = js.native
  var bindings: js.Array[BindingDef] = js.native
  var checkIndex: Double = js.native
  /** number of transitive children */
  var childCount: Double = js.native
  /** aggregated NodeFlags for all transitive children (does not include self) **/
  var childFlags: ɵNodeFlags = js.native
  /**
    * Binary or of all query ids that are matched by one of the children.
    * This includes query ids from templates as well.
    * Used as a bloom filter.
    */
  var childMatchedQueries: Double = js.native
  /** aggregated NodeFlags for all direct children (does not include self) **/
  var directChildFlags: ɵNodeFlags = js.native
  var element: ElementDef | Null = js.native
  var flags: ɵNodeFlags = js.native
  /**
    * ids and value types of all queries that are matched by this node.
    */
  var matchedQueries: NumberDictionary[ɵQueryValueType] = js.native
  /** Binary or of all matched query ids of this node. */
  var matchedQueryIds: Double = js.native
  var ngContent: NgContentDef | Null = js.native
  /** this is checked against NgContentDef.index to find matched nodes */
  var ngContentIndex: Double | Null = js.native
  var nodeIndex: Double = js.native
  var outputIndex: Double = js.native
  var outputs: js.Array[OutputDef] = js.native
  var parent: NodeDef | Null = js.native
  var provider: ProviderDef | Null = js.native
  var query: QueryDef | Null = js.native
  /**
    * references that the user placed on the element
    */
  var references: StringDictionary[ɵQueryValueType] = js.native
  var renderParent: NodeDef | Null = js.native
  var text: TextDef | Null = js.native
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
    references: StringDictionary[ɵQueryValueType]
  ): NodeDef = {
    val __obj = js.Dynamic.literal(bindingFlags = bindingFlags.asInstanceOf[js.Any], bindingIndex = bindingIndex.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], checkIndex = checkIndex.asInstanceOf[js.Any], childCount = childCount.asInstanceOf[js.Any], childFlags = childFlags.asInstanceOf[js.Any], childMatchedQueries = childMatchedQueries.asInstanceOf[js.Any], directChildFlags = directChildFlags.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], matchedQueries = matchedQueries.asInstanceOf[js.Any], matchedQueryIds = matchedQueryIds.asInstanceOf[js.Any], nodeIndex = nodeIndex.asInstanceOf[js.Any], outputIndex = outputIndex.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef]
  }
  @scala.inline
  implicit class NodeDefOps[Self <: NodeDef] (val x: Self) extends AnyVal {
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
    def setBindingFlags(value: ɵBindingFlags): Self = this.set("bindingFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindingIndex(value: Double): Self = this.set("bindingIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindingsVarargs(value: BindingDef*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[BindingDef]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckIndex(value: Double): Self = this.set("checkIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildCount(value: Double): Self = this.set("childCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildFlags(value: ɵNodeFlags): Self = this.set("childFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildMatchedQueries(value: Double): Self = this.set("childMatchedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectChildFlags(value: ɵNodeFlags): Self = this.set("directChildFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchedQueries(value: NumberDictionary[ɵQueryValueType]): Self = this.set("matchedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchedQueryIds(value: Double): Self = this.set("matchedQueryIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeIndex(value: Double): Self = this.set("nodeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputIndex(value: Double): Self = this.set("outputIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputsVarargs(value: OutputDef*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[OutputDef]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferences(value: StringDictionary[ɵQueryValueType]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: ElementDef): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementNull: Self = this.set("element", null)
    @scala.inline
    def setNgContent(value: NgContentDef): Self = this.set("ngContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgContentNull: Self = this.set("ngContent", null)
    @scala.inline
    def setNgContentIndex(value: Double): Self = this.set("ngContentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgContentIndexNull: Self = this.set("ngContentIndex", null)
    @scala.inline
    def setParent(value: NodeDef): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
    @scala.inline
    def setProvider(value: ProviderDef): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderNull: Self = this.set("provider", null)
    @scala.inline
    def setQuery(value: QueryDef): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setRenderParent(value: NodeDef): Self = this.set("renderParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderParentNull: Self = this.set("renderParent", null)
    @scala.inline
    def setText(value: TextDef): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

