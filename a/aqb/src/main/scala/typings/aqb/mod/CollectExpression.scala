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
      /* dfns */ js.Array[js.Any], 
      /* varname */ js.Any, 
      /* intoExpr */ js.Any, 
      /* keepNames */ js.Array[js.Any], 
      /* options */ js.Any, 
      PartialStatement
    ] {
  
  var _keep: js.Array[Identifier] = js.native
  
  var _options: ObjectLiteral = js.native
  
  def into(newVarname: js.Any*): CollectExpression = js.native
  
  def keep(x: js.Any*): js.Any = js.native
  
  def options(newOpts: js.Any): js.Any = js.native
  
  def toAQL(): String = js.native
  
  def withCountInto(newVarname: js.Any): CollectWithCountIntoExpression = js.native
}
