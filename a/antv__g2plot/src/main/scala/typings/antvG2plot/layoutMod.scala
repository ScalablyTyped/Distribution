package typings.antvG2plot

import typings.antvG2plot.anon.PartialSankeyLayoutOption
import typings.antvG2plot.typesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultOptions(sankeyLayoutOptions: SankeyLayoutOptions): PartialSankeyLayoutOption = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(sankeyLayoutOptions.asInstanceOf[js.Any]).asInstanceOf[PartialSankeyLayoutOption]
  
  inline def getNodeAlignFunction(nodeAlign: NodeAlign): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAlignFunction")(nodeAlign.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def sankeyLayout(sankeyLayoutOptions: SankeyLayoutOptions, data: SankeyLayoutInputData): SankeyLayoutOutputData = (^.asInstanceOf[js.Dynamic].applyDynamic("sankeyLayout")(sankeyLayoutOptions.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[SankeyLayoutOutputData]
  
  trait InputLink extends StObject {
    
    val source: Double
    
    val target: Double
    
    val value: Double
  }
  object InputLink {
    
    inline def apply(source: Double, target: Double, value: Double): InputLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputLink]
    }
    
    extension [Self <: InputLink](x: Self) {
      
      inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputNode extends StObject {
    
    val name: String
  }
  object InputNode {
    
    inline def apply(name: String): InputNode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputNode]
    }
    
    extension [Self <: InputNode](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvG2plot.antvG2plotStrings.left
    - typings.antvG2plot.antvG2plotStrings.right
    - typings.antvG2plot.antvG2plotStrings.center
    - typings.antvG2plot.antvG2plotStrings.justify
    - js.Function
  */
  type NodeAlign = _NodeAlign | js.Function
  
  type NodeDepth = js.Function2[/* datum */ Datum, /* maxDepth */ Double, Double]
  
  type NodeSort = js.Function2[/* a */ Datum, /* b */ Datum, Double]
  
  trait OutputLink extends StObject {
    
    val source: OutputNode
    
    val target: OutputNode
    
    val value: Double
    
    val width: Double
    
    var x: js.UndefOr[js.Array[Double]] = js.undefined
    
    var y: js.UndefOr[js.Array[Double]] = js.undefined
    
    val y0: Double
    
    val y1: Double
  }
  object OutputLink {
    
    inline def apply(source: OutputNode, target: OutputNode, value: Double, width: Double, y0: Double, y1: Double): OutputLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputLink]
    }
    
    extension [Self <: OutputLink](x: Self) {
      
      inline def setSource(value: OutputNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: OutputNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait OutputNode extends StObject {
    
    val depth: Double
    
    val name: String
    
    val value: Double
    
    var x: js.Array[Double]
    
    val x0: Double
    
    val x1: Double
    
    var y: js.Array[Double]
    
    val y0: Double
    
    val y1: Double
  }
  object OutputNode {
    
    inline def apply(
      depth: Double,
      name: String,
      value: Double,
      x: js.Array[Double],
      x0: Double,
      x1: Double,
      y: js.Array[Double],
      y0: Double,
      y1: Double
    ): OutputNode = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputNode]
    }
    
    extension [Self <: OutputNode](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait SankeyLayoutInputData extends StObject {
    
    val links: js.Array[InputLink]
    
    val nodes: js.Array[InputNode]
  }
  object SankeyLayoutInputData {
    
    inline def apply(links: js.Array[InputLink], nodes: js.Array[InputNode]): SankeyLayoutInputData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLayoutInputData]
    }
    
    extension [Self <: SankeyLayoutInputData](x: Self) {
      
      inline def setLinks(value: js.Array[InputLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: InputLink*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[InputNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: InputNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait SankeyLayoutOptions extends StObject {
    
    val nodeAlign: js.UndefOr[NodeAlign] = js.undefined
    
    val nodeDepth: js.UndefOr[NodeDepth] = js.undefined
    
    val nodeId: js.UndefOr[js.Function1[/* node */ Datum, Any]] = js.undefined
    
    val nodePadding: js.UndefOr[Double] = js.undefined
    
    val nodeSort: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
    
    val nodeWidth: js.UndefOr[Double] = js.undefined
  }
  object SankeyLayoutOptions {
    
    inline def apply(): SankeyLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SankeyLayoutOptions]
    }
    
    extension [Self <: SankeyLayoutOptions](x: Self) {
      
      inline def setNodeAlign(value: NodeAlign): Self = StObject.set(x, "nodeAlign", value.asInstanceOf[js.Any])
      
      inline def setNodeAlignUndefined: Self = StObject.set(x, "nodeAlign", js.undefined)
      
      inline def setNodeDepth(value: (/* datum */ Datum, /* maxDepth */ Double) => Double): Self = StObject.set(x, "nodeDepth", js.Any.fromFunction2(value))
      
      inline def setNodeDepthUndefined: Self = StObject.set(x, "nodeDepth", js.undefined)
      
      inline def setNodeId(value: /* node */ Datum => Any): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
      
      inline def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
      
      inline def setNodeSort(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "nodeSort", js.Any.fromFunction2(value))
      
      inline def setNodeSortUndefined: Self = StObject.set(x, "nodeSort", js.undefined)
      
      inline def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
      
      inline def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
    }
  }
  
  trait SankeyLayoutOutputData extends StObject {
    
    val links: js.Array[OutputLink]
    
    val nodes: js.Array[OutputNode]
  }
  object SankeyLayoutOutputData {
    
    inline def apply(links: js.Array[OutputLink], nodes: js.Array[OutputNode]): SankeyLayoutOutputData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLayoutOutputData]
    }
    
    extension [Self <: SankeyLayoutOutputData](x: Self) {
      
      inline def setLinks(value: js.Array[OutputLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: OutputLink*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[OutputNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: OutputNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait _NodeAlign extends StObject
}
