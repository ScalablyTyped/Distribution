package typings.antvG2plot

import typings.antvG2plot.antvG2plotStrings.frequency
import typings.antvG2plot.antvG2plotStrings.id
import typings.antvG2plot.antvG2plotStrings.weight
import typings.antvG2plot.relationDataMod.NodeLinkData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformChordMod {
  
  @JSImport("@antv/g2plot/lib/utils/transform/chord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chordLayout(chordLayoutOptions: ChordLayoutOptions, chordLayoutInputData: NodeLinkData): ChordLayoutOutputData = (^.asInstanceOf[js.Dynamic].applyDynamic("chordLayout")(chordLayoutOptions.asInstanceOf[js.Any], chordLayoutInputData.asInstanceOf[js.Any])).asInstanceOf[ChordLayoutOutputData]
  
  inline def getDefaultOptions(options: ChordLayoutOptions): ChordLayoutOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ChordLayoutOptions]
  
  trait ChordLayoutOptions extends StObject {
    
    var id: js.UndefOr[js.Function1[/* node */ Any, Any]] = js.undefined
    
    var nodePaddingRatio: js.UndefOr[Double] = js.undefined
    
    var nodeWidthRatio: js.UndefOr[Double] = js.undefined
    
    var sortBy: js.UndefOr[
        id | weight | frequency | Null | (js.Function2[/* a */ Any, /* b */ Any, Double])
      ] = js.undefined
    
    var source: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var sourceWeight: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    var target: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var targetWeight: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    var weight: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object ChordLayoutOptions {
    
    inline def apply(): ChordLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChordLayoutOptions]
    }
    
    extension [Self <: ChordLayoutOptions](x: Self) {
      
      inline def setId(value: /* node */ Any => Any): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNodePaddingRatio(value: Double): Self = StObject.set(x, "nodePaddingRatio", value.asInstanceOf[js.Any])
      
      inline def setNodePaddingRatioUndefined: Self = StObject.set(x, "nodePaddingRatio", js.undefined)
      
      inline def setNodeWidthRatio(value: Double): Self = StObject.set(x, "nodeWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setNodeWidthRatioUndefined: Self = StObject.set(x, "nodeWidthRatio", js.undefined)
      
      inline def setSortBy(value: id | weight | frequency | (js.Function2[/* a */ Any, /* b */ Any, Double])): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortBy", js.Any.fromFunction2(value))
      
      inline def setSortByNull: Self = StObject.set(x, "sortBy", null)
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSource(value: /* edge */ Any => Any): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceWeight(value: /* edge */ Any => Double): Self = StObject.set(x, "sourceWeight", js.Any.fromFunction1(value))
      
      inline def setSourceWeightUndefined: Self = StObject.set(x, "sourceWeight", js.undefined)
      
      inline def setTarget(value: /* edge */ Any => Any): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetWeight(value: /* edge */ Any => Double): Self = StObject.set(x, "targetWeight", js.Any.fromFunction1(value))
      
      inline def setTargetWeightUndefined: Self = StObject.set(x, "targetWeight", js.undefined)
      
      inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ChordLayoutOutputData extends StObject {
    
    val links: js.Array[OutputLink]
    
    val nodes: js.Array[OutputNode]
  }
  object ChordLayoutOutputData {
    
    inline def apply(links: js.Array[OutputLink], nodes: js.Array[OutputNode]): ChordLayoutOutputData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordLayoutOutputData]
    }
    
    extension [Self <: ChordLayoutOutputData](x: Self) {
      
      inline def setLinks(value: js.Array[OutputLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: OutputLink*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[OutputNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: OutputNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait OutputLink extends StObject {
    
    val source: OutputNode
    
    val target: OutputNode
    
    val value: Double
    
    var x: js.UndefOr[js.Array[Double]] = js.undefined
    
    var y: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object OutputLink {
    
    inline def apply(source: OutputNode, target: OutputNode, value: Double): OutputLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputLink]
    }
    
    extension [Self <: OutputLink](x: Self) {
      
      inline def setSource(value: OutputNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: OutputNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  trait OutputNode extends StObject {
    
    val id: Double
    
    val name: String
    
    val value: Double
    
    var x: js.Array[Double]
    
    var y: js.Array[Double]
  }
  object OutputNode {
    
    inline def apply(id: Double, name: String, value: Double, x: js.Array[Double], y: js.Array[Double]): OutputNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputNode]
    }
    
    extension [Self <: OutputNode](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setX(value: js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
}
