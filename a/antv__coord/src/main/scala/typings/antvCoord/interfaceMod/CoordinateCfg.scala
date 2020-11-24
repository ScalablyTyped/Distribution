package typings.antvCoord.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateCfg extends js.Object {
  
  val end: Point = js.native
  
  val isTransposed: js.UndefOr[Boolean] = js.native
  
  val matrix: js.UndefOr[js.Array[Double]] = js.native
  
  val start: Point = js.native
}
object CoordinateCfg {
  
  @scala.inline
  def apply(end: Point, start: Point): CoordinateCfg = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateCfg]
  }
  
  @scala.inline
  implicit class CoordinateCfgOps[Self <: CoordinateCfg] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTransposed(value: Boolean): Self = this.set("isTransposed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTransposed: Self = this.set("isTransposed", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = this.set("matrix", js.Array(value :_*))
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
  }
}
