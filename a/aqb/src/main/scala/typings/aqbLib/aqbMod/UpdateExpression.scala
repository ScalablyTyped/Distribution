package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpression
  extends PartialStatement
     with org.scalablytyped.runtime.Instantiable5[
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
  def toAQL(): java.lang.String = js.native
}

