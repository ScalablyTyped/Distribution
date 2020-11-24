package typings.antvDataSet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GEO extends js.Object {
  
  var GEO: String = js.native
  
  var GEO_GRATICULE: String = js.native
  
  var GRAPH: String = js.native
  
  var HEX: String = js.native
  
  var HIERARCHY: String = js.native
  
  var STATISTICS_METHODS: js.Array[String] = js.native
  
  var TABLE: String = js.native
}
object GEO {
  
  @scala.inline
  def apply(
    GEO: String,
    GEO_GRATICULE: String,
    GRAPH: String,
    HEX: String,
    HIERARCHY: String,
    STATISTICS_METHODS: js.Array[String],
    TABLE: String
  ): GEO = {
    val __obj = js.Dynamic.literal(GEO = GEO.asInstanceOf[js.Any], GEO_GRATICULE = GEO_GRATICULE.asInstanceOf[js.Any], GRAPH = GRAPH.asInstanceOf[js.Any], HEX = HEX.asInstanceOf[js.Any], HIERARCHY = HIERARCHY.asInstanceOf[js.Any], STATISTICS_METHODS = STATISTICS_METHODS.asInstanceOf[js.Any], TABLE = TABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[GEO]
  }
  
  @scala.inline
  implicit class GEOOps[Self <: GEO] (val x: Self) extends AnyVal {
    
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
    def setGEO(value: String): Self = this.set("GEO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGEO_GRATICULE(value: String): Self = this.set("GEO_GRATICULE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGRAPH(value: String): Self = this.set("GRAPH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHEX(value: String): Self = this.set("HEX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHIERARCHY(value: String): Self = this.set("HIERARCHY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTATISTICS_METHODSVarargs(value: String*): Self = this.set("STATISTICS_METHODS", js.Array(value :_*))
    
    @scala.inline
    def setSTATISTICS_METHODS(value: js.Array[String]): Self = this.set("STATISTICS_METHODS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTABLE(value: String): Self = this.set("TABLE", value.asInstanceOf[js.Any])
  }
}
