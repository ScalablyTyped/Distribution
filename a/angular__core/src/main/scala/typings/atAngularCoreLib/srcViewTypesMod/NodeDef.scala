package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeDef extends js.Object {
  var bindingFlags: BindingFlags
  var bindingIndex: scala.Double
  var bindings: js.Array[BindingDef]
  var checkIndex: scala.Double
  /** number of transitive children */
  var childCount: scala.Double
  /** aggregated NodeFlags for all transitive children (does not include self) **/
  var childFlags: NodeFlags
  /**
       * Binary or of all query ids that are matched by one of the children.
       * This includes query ids from templates as well.
       * Used as a bloom filter.
       */
  var childMatchedQueries: scala.Double
  /** aggregated NodeFlags for all direct children (does not include self) **/
  var directChildFlags: NodeFlags
  var element: ElementDef | scala.Null
  var flags: NodeFlags
  /**
       * ids and value types of all queries that are matched by this node.
       */
  var matchedQueries: ScalablyTyped.runtime.NumberDictionary[QueryValueType]
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
  var references: ScalablyTyped.runtime.StringDictionary[QueryValueType]
  var renderParent: NodeDef | scala.Null
  var text: TextDef | scala.Null
}

