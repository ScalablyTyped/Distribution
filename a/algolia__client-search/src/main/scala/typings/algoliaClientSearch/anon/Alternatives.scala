package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternatives extends js.Object {
  
  /**
    * The explain query match alternatives.
    */
  var alternatives: js.Array[Length] = js.native
}
object Alternatives {
  
  @scala.inline
  def apply(alternatives: js.Array[Length]): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
  
  @scala.inline
  implicit class AlternativesOps[Self <: Alternatives] (val x: Self) extends AnyVal {
    
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
    def setAlternativesVarargs(value: Length*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[Length]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
  }
}
