package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExpression
  extends StObject
     with PartialStatement
     with Instantiable5[
      /* prev */ PartialStatement, 
      /* expr */ Any, 
      /* withExpr */ Any, 
      /* collection */ Any, 
      /* options */ Any, 
      PartialStatement
    ] {
  
  def options(newOpts: Any): UpdateExpression = js.native
  
  def returnNew(x: Any): ReturnExpression = js.native
  
  def returnOld(x: Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
