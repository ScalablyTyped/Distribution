package typings.antvDataSet.anon

import typings.antvDataSet.antvDataSetStrings.`fill-rows`
import typings.antvDataSet.antvDataSetStrings.`kernel-smoothDotdensity`
import typings.antvDataSet.antvDataSetStrings.`kernel-smoothDotregression`
import typings.antvDataSet.antvDataSetStrings.`rename-fields`
import typings.antvDataSet.antvDataSetStrings.`sort-by`
import typings.antvDataSet.antvDataSetStrings.`tag-cloud`
import typings.antvDataSet.antvDataSetStrings.`word-cloud`
import typings.antvDataSet.antvDataSetStrings.adjacency
import typings.antvDataSet.antvDataSetStrings.aggregate
import typings.antvDataSet.antvDataSetStrings.arc
import typings.antvDataSet.antvDataSetStrings.binDotdot
import typings.antvDataSet.antvDataSetStrings.binDothex
import typings.antvDataSet.antvDataSetStrings.binDothexagon
import typings.antvDataSet.antvDataSetStrings.binDothistogram
import typings.antvDataSet.antvDataSetStrings.binDotquantile
import typings.antvDataSet.antvDataSetStrings.binDotrect
import typings.antvDataSet.antvDataSetStrings.binDotrectangle
import typings.antvDataSet.antvDataSetStrings.default
import typings.antvDataSet.antvDataSetStrings.diagramDotarc
import typings.antvDataSet.antvDataSetStrings.diagramDotsankey
import typings.antvDataSet.antvDataSetStrings.diagramDotvoronoi
import typings.antvDataSet.antvDataSetStrings.fillRows
import typings.antvDataSet.antvDataSetStrings.filter
import typings.antvDataSet.antvDataSetStrings.fold
import typings.antvDataSet.antvDataSetStrings.geoDotcentroid
import typings.antvDataSet.antvDataSetStrings.geoDotprojection
import typings.antvDataSet.antvDataSetStrings.geoDotregion
import typings.antvDataSet.antvDataSetStrings.group
import typings.antvDataSet.antvDataSetStrings.groups
import typings.antvDataSet.antvDataSetStrings.hexbin
import typings.antvDataSet.antvDataSetStrings.hierarchyDotpartition
import typings.antvDataSet.antvDataSetStrings.hierarchyDottreemap
import typings.antvDataSet.antvDataSetStrings.impute
import typings.antvDataSet.antvDataSetStrings.kernelDotdensity
import typings.antvDataSet.antvDataSetStrings.kernelDotregression
import typings.antvDataSet.antvDataSetStrings.map
import typings.antvDataSet.antvDataSetStrings.partition
import typings.antvDataSet.antvDataSetStrings.percent
import typings.antvDataSet.antvDataSetStrings.pick
import typings.antvDataSet.antvDataSetStrings.proportion
import typings.antvDataSet.antvDataSetStrings.regression
import typings.antvDataSet.antvDataSetStrings.rename
import typings.antvDataSet.antvDataSetStrings.reverse
import typings.antvDataSet.antvDataSetStrings.sankey
import typings.antvDataSet.antvDataSetStrings.sort
import typings.antvDataSet.antvDataSetStrings.sortBy
import typings.antvDataSet.antvDataSetStrings.subset
import typings.antvDataSet.antvDataSetStrings.summary
import typings.antvDataSet.antvDataSetStrings.treemap
import typings.antvDataSet.antvDataSetStrings.voronoi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] extends js.Object {
  
  var `type`: T = js.native
}
object Type {
  
  @scala.inline
  def apply[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](`type`: T): Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T]]
  }
  
  @scala.inline
  implicit class TypeOps[Self <: Type[_], T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] (val x: Self with Type[T]) extends AnyVal {
    
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
