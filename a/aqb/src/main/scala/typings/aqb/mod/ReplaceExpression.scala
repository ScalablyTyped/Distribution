package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceExpression
  extends PartialStatement
     with Instantiable5[
      /* prev */ PartialStatement, 
      /* expr */ js.Any, 
      /* withExpr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  
  def options(newOpts: js.Any): ReplaceExpression = js.native
  
  def returnNew(x: js.Any): ReturnExpression = js.native
  
  def returnOld(x: js.Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
