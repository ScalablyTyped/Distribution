package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExpression
  extends PartialStatement
     with Instantiable5[
      /* prev */ PartialStatement, 
      /* expr */ js.Any, 
      /* withExpr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  
  def options(newOpts: js.Any): UpdateExpression = js.native
  
  def returnNew(x: js.Any): ReturnExpression = js.native
  
  def returnOld(x: js.Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
