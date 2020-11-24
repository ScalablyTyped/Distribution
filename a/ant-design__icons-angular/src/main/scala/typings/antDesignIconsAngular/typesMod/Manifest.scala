package typings.antDesignIconsAngular.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest extends js.Object {
  
  var fill: js.Array[String] = js.native
  
  var outline: js.Array[String] = js.native
  
  var twotone: js.Array[String] = js.native
}
object Manifest {
  
  @scala.inline
  def apply(fill: js.Array[String], outline: js.Array[String], twotone: js.Array[String]): Manifest = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], twotone = twotone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    
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
    def setFillVarargs(value: String*): Self = this.set("fill", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: js.Array[String]): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineVarargs(value: String*): Self = this.set("outline", js.Array(value :_*))
    
    @scala.inline
    def setOutline(value: js.Array[String]): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwotoneVarargs(value: String*): Self = this.set("twotone", js.Array(value :_*))
    
    @scala.inline
    def setTwotone(value: js.Array[String]): Self = this.set("twotone", value.asInstanceOf[js.Any])
  }
}
