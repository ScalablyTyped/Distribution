package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectExpression
  extends StObject
     with PartialStatement
     with Instantiable6[
      /* prev */ PartialStatement, 
      /* dfns */ js.Array[Any], 
      /* varname */ Any, 
      /* intoExpr */ Any, 
      /* keepNames */ js.Array[Any], 
      /* options */ Any, 
      PartialStatement
    ] {
  
  var _keep: js.Array[Identifier] = js.native
  
  var _options: ObjectLiteral = js.native
  
  def into(newVarname: Any*): CollectExpression = js.native
  
  def keep(x: Any*): Any = js.native
  
  def options(newOpts: Any): Any = js.native
  
  def toAQL(): String = js.native
  
  def withCountInto(newVarname: Any): CollectWithCountIntoExpression = js.native
}
