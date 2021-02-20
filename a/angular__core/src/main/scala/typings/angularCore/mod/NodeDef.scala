package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
trait NodeDef extends StObject {
  
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
  implicit class NodeDefMutableBuilder[Self <: NodeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingFlags(value: ɵBindingFlags): Self = StObject.set(x, "bindingFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingIndex(value: Double): Self = StObject.set(x, "bindingIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindings(value: js.Array[BindingDef]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsVarargs(value: BindingDef*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setCheckIndex(value: Double): Self = StObject.set(x, "checkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFlags(value: ɵNodeFlags): Self = StObject.set(x, "childFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildMatchedQueries(value: Double): Self = StObject.set(x, "childMatchedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectChildFlags(value: ɵNodeFlags): Self = StObject.set(x, "directChildFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: ElementDef): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementNull: Self = StObject.set(x, "element", null)
    
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedQueries(value: NumberDictionary[ɵQueryValueType]): Self = StObject.set(x, "matchedQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedQueryIds(value: Double): Self = StObject.set(x, "matchedQueryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContent(value: NgContentDef): Self = StObject.set(x, "ngContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentIndex(value: Double): Self = StObject.set(x, "ngContentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNgContentIndexNull: Self = StObject.set(x, "ngContentIndex", null)
    
    @scala.inline
    def setNgContentNull: Self = StObject.set(x, "ngContent", null)
    
    @scala.inline
    def setNodeIndex(value: Double): Self = StObject.set(x, "nodeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputIndex(value: Double): Self = StObject.set(x, "outputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[OutputDef]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: OutputDef*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: NodeDef): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setProvider(value: ProviderDef): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderNull: Self = StObject.set(x, "provider", null)
    
    @scala.inline
    def setQuery(value: QueryDef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryNull: Self = StObject.set(x, "query", null)
    
    @scala.inline
    def setReferences(value: StringDictionary[ɵQueryValueType]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderParent(value: NodeDef): Self = StObject.set(x, "renderParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderParentNull: Self = StObject.set(x, "renderParent", null)
    
    @scala.inline
    def setText(value: TextDef): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
  }
}
