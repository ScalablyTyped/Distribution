package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResult extends StObject {
  
  var args: js.Array[js.Any]
  
  var kwargs: js.Any
}
object IResult {
  
  @scala.inline
  def apply(args: js.Array[js.Any], kwargs: js.Any): IResult = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kwargs = kwargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  
  @scala.inline
  implicit class IResultMutableBuilder[Self <: IResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setKwargs(value: js.Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
  }
}
