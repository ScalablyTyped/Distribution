package typings.angularOdataResources.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends js.Object {
  
  var add: js.Array[String] = js.native
  
  var and: js.Array[String] = js.native
  
  var div: js.Array[String] = js.native
  
  @JSName("eq")
  var eq_FAdd: js.Array[String] = js.native
  
  var ge: js.Array[String] = js.native
  
  var gt: js.Array[String] = js.native
  
  var le: js.Array[String] = js.native
  
  var lt: js.Array[String] = js.native
  
  var mod: js.Array[String] = js.native
  
  var mul: js.Array[String] = js.native
  
  @JSName("ne")
  var ne_FAdd: js.Array[String] = js.native
  
  var not: js.Array[String] = js.native
  
  var or: js.Array[String] = js.native
  
  var sub: js.Array[String] = js.native
}
object Add {
  
  @scala.inline
  def apply(
    add: js.Array[String],
    and: js.Array[String],
    div: js.Array[String],
    eq: js.Array[String],
    ge: js.Array[String],
    gt: js.Array[String],
    le: js.Array[String],
    lt: js.Array[String],
    mod: js.Array[String],
    mul: js.Array[String],
    ne: js.Array[String],
    not: js.Array[String],
    or: js.Array[String],
    sub: js.Array[String]
  ): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], eq = eq.asInstanceOf[js.Any], ge = ge.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], le = le.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], mul = mul.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    
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
    def setAddVarargs(value: String*): Self = this.set("add", js.Array(value :_*))
    
    @scala.inline
    def setAdd(value: js.Array[String]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndVarargs(value: String*): Self = this.set("and", js.Array(value :_*))
    
    @scala.inline
    def setAnd(value: js.Array[String]): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivVarargs(value: String*): Self = this.set("div", js.Array(value :_*))
    
    @scala.inline
    def setDiv(value: js.Array[String]): Self = this.set("div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqVarargs(value: String*): Self = this.set("eq", js.Array(value :_*))
    
    @scala.inline
    def setEq(value: js.Array[String]): Self = this.set("eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeVarargs(value: String*): Self = this.set("ge", js.Array(value :_*))
    
    @scala.inline
    def setGe(value: js.Array[String]): Self = this.set("ge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtVarargs(value: String*): Self = this.set("gt", js.Array(value :_*))
    
    @scala.inline
    def setGt(value: js.Array[String]): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeVarargs(value: String*): Self = this.set("le", js.Array(value :_*))
    
    @scala.inline
    def setLe(value: js.Array[String]): Self = this.set("le", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtVarargs(value: String*): Self = this.set("lt", js.Array(value :_*))
    
    @scala.inline
    def setLt(value: js.Array[String]): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModVarargs(value: String*): Self = this.set("mod", js.Array(value :_*))
    
    @scala.inline
    def setMod(value: js.Array[String]): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulVarargs(value: String*): Self = this.set("mul", js.Array(value :_*))
    
    @scala.inline
    def setMul(value: js.Array[String]): Self = this.set("mul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeVarargs(value: String*): Self = this.set("ne", js.Array(value :_*))
    
    @scala.inline
    def setNe(value: js.Array[String]): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotVarargs(value: String*): Self = this.set("not", js.Array(value :_*))
    
    @scala.inline
    def setNot(value: js.Array[String]): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrVarargs(value: String*): Self = this.set("or", js.Array(value :_*))
    
    @scala.inline
    def setOr(value: js.Array[String]): Self = this.set("or", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubVarargs(value: String*): Self = this.set("sub", js.Array(value :_*))
    
    @scala.inline
    def setSub(value: js.Array[String]): Self = this.set("sub", value.asInstanceOf[js.Any])
  }
}
