package typings.angularOdataResources

import typings.angularOdataResources.OData.IExecutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add extends StObject {
    
    var add: js.Array[String]
    
    var and: js.Array[String]
    
    var div: js.Array[String]
    
    @JSName("eq")
    var eq_FAdd: js.Array[String]
    
    var ge: js.Array[String]
    
    var gt: js.Array[String]
    
    var le: js.Array[String]
    
    var lt: js.Array[String]
    
    var mod: js.Array[String]
    
    var mul: js.Array[String]
    
    @JSName("ne")
    var ne_FAdd: js.Array[String]
    
    var not: js.Array[String]
    
    var or: js.Array[String]
    
    var sub: js.Array[String]
  }
  object Add {
    
    inline def apply(
      add: js.Array[String],
      and: js.Array[String],
      div: js.Array[String],
      eq_ : js.Array[String],
      ge: js.Array[String],
      gt: js.Array[String],
      le: js.Array[String],
      lt: js.Array[String],
      mod: js.Array[String],
      mul: js.Array[String],
      ne_ : js.Array[String],
      not: js.Array[String],
      or: js.Array[String],
      sub: js.Array[String]
    ): Add = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], ge = ge.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any], le = le.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], mul = mul.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(eq_.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Add]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: js.Array[String]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddVarargs(value: String*): Self = StObject.set(x, "add", js.Array(value*))
      
      inline def setAnd(value: js.Array[String]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: String*): Self = StObject.set(x, "and", js.Array(value*))
      
      inline def setDiv(value: js.Array[String]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDivVarargs(value: String*): Self = StObject.set(x, "div", js.Array(value*))
      
      inline def setEq_(value: js.Array[String]): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
      
      inline def setEq_Varargs(value: String*): Self = StObject.set(x, "eq", js.Array(value*))
      
      inline def setGe(value: js.Array[String]): Self = StObject.set(x, "ge", value.asInstanceOf[js.Any])
      
      inline def setGeVarargs(value: String*): Self = StObject.set(x, "ge", js.Array(value*))
      
      inline def setGt(value: js.Array[String]): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      inline def setGtVarargs(value: String*): Self = StObject.set(x, "gt", js.Array(value*))
      
      inline def setLe(value: js.Array[String]): Self = StObject.set(x, "le", value.asInstanceOf[js.Any])
      
      inline def setLeVarargs(value: String*): Self = StObject.set(x, "le", js.Array(value*))
      
      inline def setLt(value: js.Array[String]): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtVarargs(value: String*): Self = StObject.set(x, "lt", js.Array(value*))
      
      inline def setMod(value: js.Array[String]): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModVarargs(value: String*): Self = StObject.set(x, "mod", js.Array(value*))
      
      inline def setMul(value: js.Array[String]): Self = StObject.set(x, "mul", value.asInstanceOf[js.Any])
      
      inline def setMulVarargs(value: String*): Self = StObject.set(x, "mul", js.Array(value*))
      
      inline def setNe_(value: js.Array[String]): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      inline def setNe_Varargs(value: String*): Self = StObject.set(x, "ne", js.Array(value*))
      
      inline def setNot(value: js.Array[String]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotVarargs(value: String*): Self = StObject.set(x, "not", js.Array(value*))
      
      inline def setOr(value: js.Array[String]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      inline def setOrVarargs(value: String*): Self = StObject.set(x, "or", js.Array(value*))
      
      inline def setSub(value: js.Array[String]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubVarargs(value: String*): Self = StObject.set(x, "sub", js.Array(value*))
    }
  }
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Method {
    
    inline def apply(): Method = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait TypeofPredicate extends StObject {
    
    /* static member */
    def and(andStatements: Any): IExecutable = js.native
    
    /* static member */
    def create(propertyOrPredicate: Any): IExecutable = js.native
    def create(propertyOrPredicate: Any, operatorOrValue: Any): IExecutable = js.native
    def create(propertyOrPredicate: Any, operatorOrValue: Any, value: Any): IExecutable = js.native
    def create(propertyOrPredicate: Any, operatorOrValue: Unit, value: Any): IExecutable = js.native
    
    /* static member */
    def or(orStatements: js.Array[Any]): IExecutable = js.native
  }
}
