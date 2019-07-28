package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

